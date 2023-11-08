package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.dto.requestDTO.StudentRequest;
import com.example.librarymanagementsystem.dto.responsetDTO.StudentResponse;
import com.example.librarymanagementsystem.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity addStudent(@RequestBody StudentRequest studentRequest){
        StudentResponse response = studentService.addStudent(studentRequest);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity getStudent(@RequestParam("id") int regNo){
        StudentResponse student = studentService.getStudent(regNo);
        if(student!=null){
            return new ResponseEntity(student,HttpStatus.FOUND);
        }
        return new ResponseEntity("Invalid id!!",HttpStatus.BAD_REQUEST);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteStudent(@RequestParam int id)
    {
        studentService.deleteStudent( id);
        return new ResponseEntity("Student deleted successfully",HttpStatus.OK);
    }

    @PutMapping ("/update")
    public ResponseEntity updateStudentAge(@RequestParam int age,@RequestParam int id)
    {
        studentService.updateStudentAge( id,age);
        return new ResponseEntity("Student Age updated  successfully",HttpStatus.OK);
    }

    @GetMapping("/get-males")
    public List<String> getAllMales(){
        List<String> males = studentService.getAllMales();
        return males;
    }
}

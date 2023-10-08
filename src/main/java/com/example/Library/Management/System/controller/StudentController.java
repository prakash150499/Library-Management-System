package com.example.Library.Management.System.controller;

import com.example.Library.Management.System.dtos.request.StudentRequest;
import com.example.Library.Management.System.dtos.response.StudentResponse;
import com.example.Library.Management.System.enums.Gender;
import com.example.Library.Management.System.model.Student;
import com.example.Library.Management.System.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentServiceImpl studentService;
    @PostMapping("/add-student")
    public ResponseEntity addStudent(@RequestBody StudentRequest studentRequest)
    {
        return new ResponseEntity(studentService.addStudent(studentRequest), HttpStatus.CREATED);
    }
    @GetMapping("/get-student")
    public ResponseEntity getStudent(@RequestParam("id") int id){

        StudentResponse studentResponse=studentService.getStudent(id);
        if(studentResponse==null)
        {
            return new ResponseEntity("Invalid ID",HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(studentResponse,HttpStatus.FOUND);

    }
    @DeleteMapping("/delete-student")
    public ResponseEntity deleteStudentById(@RequestParam("id") int id)
    {
        studentService.deleteStudentById(id);
        return new ResponseEntity("Student Deleted Successfully"+" "+id+" ",HttpStatus.OK);
    }
    @PutMapping("/update-age")
    public ResponseEntity updateAge(@RequestParam("id") int id,@RequestParam("age") int age)
    {
        StudentResponse studentResponse=studentService.updateAge(id,age);
        return new ResponseEntity(studentResponse,HttpStatus.OK);
    }
    @GetMapping("/get-all")
    public ResponseEntity getAllStudents()
    {
        List<StudentResponse> studentResponseList= studentService.getAllStudent();
        return new ResponseEntity(studentResponseList,HttpStatus.FOUND);
    }
    @GetMapping("/get-all-by-gender")
    public ResponseEntity getAllStudentsByGender(@RequestParam("gender") Gender gender)
    {
        List<StudentResponse> studentResponseList= studentService.getAllStudentsByGender(gender);
        return new ResponseEntity(studentResponseList,HttpStatus.FOUND);
    }



}

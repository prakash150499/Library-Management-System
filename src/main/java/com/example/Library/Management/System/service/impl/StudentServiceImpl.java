package com.example.Library.Management.System.service.impl;

import com.example.Library.Management.System.dtos.request.StudentRequest;
import com.example.Library.Management.System.dtos.response.StudentResponse;
import com.example.Library.Management.System.enums.Gender;
import com.example.Library.Management.System.model.Student;
import com.example.Library.Management.System.repository.StudentRepository;
import com.example.Library.Management.System.service.StudentService;
import com.example.Library.Management.System.transformers.StudentTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;
    @Override
    public StudentResponse addStudent(StudentRequest studentRequest) {

        Student student= StudentTransformer.studentRequestToStudent(studentRequest);
        Student savedStudent=studentRepository.save(student);
        StudentResponse studentResponse=StudentTransformer.studentToStudentResponse(savedStudent);
        return studentResponse;
    }
    @Override
    public StudentResponse getStudent(int id) {
        Student student=null;
        try
        {
            student=studentRepository.findById(id).get();
        }
        catch(Exception e)
        {
            return null;
        }

        StudentResponse studentResponse=StudentTransformer.studentToStudentResponse(student);
        return studentResponse;
    }
    @Override
    public int deleteStudentById(int id) {
        studentRepository.deleteById(id);
        return id;
    }

    @Override
    public StudentResponse updateAge(int id, int age) {

        Student student=studentRepository.findById(id).get();

        student.setAge(age);

      return  StudentTransformer.studentToStudentResponse(studentRepository.save(student));
    }

    @Override
    public List<StudentResponse> getAllStudent() {
        List<Student>studentList=studentRepository.findAll();
        List<StudentResponse>studentResponseList=new ArrayList<>();
        for(Student student:studentList)
        {
            StudentResponse studentResponse=StudentTransformer.studentToStudentResponse(student);
            studentResponseList.add(studentResponse);
        }
        return studentResponseList;
    }

    @Override
    public List<StudentResponse> getAllStudentsByGender(Gender gender) {

        List<Student>studentList=studentRepository.findByGender(gender);
        List<StudentResponse>studentResponseList=new ArrayList<>();
        for(Student student:studentList)
        {
            StudentResponse studentResponse=StudentTransformer.studentToStudentResponse(student);
            studentResponseList.add(studentResponse);
        }
        return studentResponseList;
    }
}

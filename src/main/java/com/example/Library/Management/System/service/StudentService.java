package com.example.Library.Management.System.service;

import com.example.Library.Management.System.dtos.request.StudentRequest;
import com.example.Library.Management.System.dtos.response.StudentResponse;
import com.example.Library.Management.System.enums.Gender;
import com.example.Library.Management.System.model.Student;

import java.util.List;

public interface StudentService {
    StudentResponse addStudent(StudentRequest studentRequest);
    StudentResponse getStudent(int id);
    int deleteStudentById(int id);

    StudentResponse updateAge(int id, int age);

    List<StudentResponse> getAllStudent();

    List<StudentResponse> getAllStudentsByGender(Gender gender);
}

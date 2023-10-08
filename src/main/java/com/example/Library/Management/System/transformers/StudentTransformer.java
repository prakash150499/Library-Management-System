package com.example.Library.Management.System.transformers;

import com.example.Library.Management.System.dtos.request.StudentRequest;
import com.example.Library.Management.System.dtos.response.LibraryCardResponse;
import com.example.Library.Management.System.dtos.response.StudentResponse;
import com.example.Library.Management.System.model.LibraryCard;
import com.example.Library.Management.System.model.Student;

public class StudentTransformer {

    public static Student studentRequestToStudent(StudentRequest studentRequest)
    {
        LibraryCard libraryCard=LibraryCardTransformer.prepareLibraryCard();
       Student student= Student.builder()
                .age(studentRequest.getAge())
                .email(studentRequest.getEmail())
                .gender(studentRequest.getGender())
                .libraryCard(libraryCard)
                .name(studentRequest.getName())
                .build();
       libraryCard.setStudent(student);
       return student;
    }
    public static StudentResponse studentToStudentResponse(Student student)
    {
        LibraryCardResponse libraryCardResponse1=LibraryCardTransformer.libraryCardToLibraryCardResponse(student.getLibraryCard());

        return StudentResponse.builder()
                .name(student.getName())
                .email(student.getEmail())
                .libraryCardReponse(libraryCardResponse1)
                .build();
    }

}

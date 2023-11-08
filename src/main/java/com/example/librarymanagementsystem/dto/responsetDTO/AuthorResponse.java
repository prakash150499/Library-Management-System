package com.example.librarymanagementsystem.dto.responsetDTO;

import com.example.librarymanagementsystem.model.Book;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AuthorResponse {

    int id;

    String name;

    int age;


    String emailId;


    Date lastActivity;

    List<BookResponse> booksResponse = new ArrayList<>();
}

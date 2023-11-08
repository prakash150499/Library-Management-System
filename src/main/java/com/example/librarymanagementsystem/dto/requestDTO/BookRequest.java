package com.example.librarymanagementsystem.dto.requestDTO;

import com.example.librarymanagementsystem.Enum.Genre;

import lombok.*;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookRequest {

    int id;

    String title;

    int noOfPages;

    Genre genre;

    double cost;

    boolean issued;

    int authorID;

}

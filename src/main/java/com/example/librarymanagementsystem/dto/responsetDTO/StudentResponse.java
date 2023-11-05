package com.example.librarymanagementsystem.dto.responsetDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class StudentResponse {

    String name;

    String email;

    LibraryCardReponse libraryCardReponse;
}

package com.example.Library.Management.System.dtos.response;

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

    LibraryCardResponse libraryCardReponse;
}
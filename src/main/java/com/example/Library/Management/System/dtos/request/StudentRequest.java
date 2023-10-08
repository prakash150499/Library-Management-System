package com.example.Library.Management.System.dtos.request;

import com.example.Library.Management.System.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentRequest {

    String name;

    int age;

    String email;

    Gender gender;
}

package com.example.Library.Management.System.model;
import com.example.Library.Management.System.enums.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level=AccessLevel.PRIVATE)
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;

    String name;
    int age;
    String email;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    LibraryCard libraryCard;
}

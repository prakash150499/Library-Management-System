package com.example.Library.Management.System.dtos.response;

import com.example.Library.Management.System.enums.CardStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.sql.Date;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class LibraryCardResponse {

    String cardNo;

    CardStatus cardStatus;

    Date issueDate;
}

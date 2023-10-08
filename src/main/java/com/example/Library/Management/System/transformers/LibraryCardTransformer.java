package com.example.Library.Management.System.transformers;

import com.example.Library.Management.System.dtos.response.LibraryCardResponse;
import com.example.Library.Management.System.enums.CardStatus;
import com.example.Library.Management.System.model.LibraryCard;

import java.util.UUID;

public class LibraryCardTransformer {

    public static LibraryCard prepareLibraryCard()
    {


        return LibraryCard.builder()
                .cardNo(String.valueOf(UUID.randomUUID()))
                .cardStatus(CardStatus.ACTIVE)
                .build();
    }
    public static LibraryCardResponse libraryCardToLibraryCardResponse(LibraryCard libraryCard)
    {

        return LibraryCardResponse.builder()
                .cardNo(libraryCard.getCardNo())
                .cardStatus(libraryCard.getCardStatus())
                .issueDate(libraryCard.getIssueDate())
                .build();
    }
}

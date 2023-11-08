package com.example.librarymanagementsystem.transformer;

import com.example.librarymanagementsystem.dto.requestDTO.BookRequest;
import com.example.librarymanagementsystem.dto.responsetDTO.BookResponse;
import com.example.librarymanagementsystem.model.Author;
import com.example.librarymanagementsystem.model.Book;

import java.util.ArrayList;

public class BookTransformer {

    public static BookResponse BookToBookResponse(Book book){

        return BookResponse.builder()
                .authorName(book.getAuthor().getName())
                .cost(book.getCost())
                .genre(book.getGenre())
                .noOfPages(book.getNoOfPages())
                .title(book.getTitle())
                .build();
    }
    public static Book BookRequestToBook(BookRequest bookRequest){

        return Book.builder()
                .author(new Author())
                .issued(bookRequest.isIssued())
                .cost(bookRequest.getCost())
                .genre(bookRequest.getGenre())
                .transactions(new ArrayList<>())
                .noOfPages(bookRequest.getNoOfPages())
                .title(bookRequest.getTitle())
                .build();
    }
}

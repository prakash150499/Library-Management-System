package com.example.librarymanagementsystem.transformer;

import com.example.librarymanagementsystem.dto.requestDTO.AuthorRequest;
import com.example.librarymanagementsystem.dto.responsetDTO.AuthorResponse;
import com.example.librarymanagementsystem.dto.responsetDTO.BookResponse;
import com.example.librarymanagementsystem.model.Author;
import com.example.librarymanagementsystem.model.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorTransformer {

    public static Author authorRequestToAuthor(AuthorRequest authorRequest){

        return Author.builder()
                .age(authorRequest.getAge())
                .name(authorRequest.getName())
                .books(new ArrayList<>())
                .emailId(authorRequest.getEmailId())
                .build();
    }
    public static AuthorResponse authorToAuthorResponse(Author author){
        List<BookResponse>bookResponseList=new ArrayList<>();
        for(Book book: author.getBooks())
        {
            BookResponse bookResponse=BookTransformer.BookToBookResponse(book);
            bookResponseList.add(bookResponse);
        }
        return AuthorResponse.builder()
                .name(author.getName())
                .age(author.getAge())
                .id(author.getId())
                .booksResponse(bookResponseList)
                .emailId(author.getEmailId())
                .lastActivity(author.getLastActivity())
                .build();
    }

}

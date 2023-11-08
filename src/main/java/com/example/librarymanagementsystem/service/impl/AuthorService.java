package com.example.librarymanagementsystem.service.impl;

import com.example.librarymanagementsystem.dto.requestDTO.AuthorRequest;
import com.example.librarymanagementsystem.dto.responsetDTO.AuthorResponse;
import com.example.librarymanagementsystem.model.Author;
import com.example.librarymanagementsystem.repository.AuthorRepository;
import com.example.librarymanagementsystem.transformer.AuthorTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
    public AuthorResponse addAuthor(AuthorRequest authorRequest) {
        Author author= AuthorTransformer.authorRequestToAuthor(authorRequest);
        Author savedAuthor=authorRepository.save(author);
        return AuthorTransformer.authorToAuthorResponse(savedAuthor);
    }

// Delete Author
    public void deleteAuthor(int authorID) {
        authorRepository.deleteById(authorID);
    }
}

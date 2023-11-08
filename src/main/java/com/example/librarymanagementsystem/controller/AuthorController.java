package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.dto.requestDTO.AuthorRequest;
import com.example.librarymanagementsystem.dto.responsetDTO.AuthorResponse;
import com.example.librarymanagementsystem.service.impl.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @PostMapping("/add/author")
    public ResponseEntity addAuthor(@RequestBody AuthorRequest authorRequest){
        AuthorResponse authorResponse = authorService.addAuthor(authorRequest);
        return new ResponseEntity(authorResponse, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/author")
    public ResponseEntity deleteAuthor(@RequestParam int authorID)
    {
        authorService.deleteAuthor(authorID);
        return new ResponseEntity("Author Deleted Sucessfully", HttpStatus.CREATED);
    }


}

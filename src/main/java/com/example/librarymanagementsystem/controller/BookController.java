package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.Enum.Genre;
import com.example.librarymanagementsystem.dto.requestDTO.BookRequest;
import com.example.librarymanagementsystem.dto.responsetDTO.BookResponse;
import com.example.librarymanagementsystem.model.Book;
import com.example.librarymanagementsystem.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/add/book")
    public ResponseEntity addBook(@RequestBody BookRequest bookRequest){

        try{
           BookResponse bookResponse = bookService.addBook(bookRequest);
           return new ResponseEntity(bookResponse, HttpStatus.CREATED);
        }
        catch (Exception e){
             return new ResponseEntity(e.getMessage(), HttpStatus.CREATED);
        }
    }

    @GetMapping("/get-by-genre-cost")
    public List<BookResponse> getBooksByGenreAndCostGreaterThan(@RequestParam("genre") String genre,
                                                                @RequestParam("cost") double cost){
       return bookService.getBooksByGenreAndCostGreaterThan(genre,cost);

    }

    @GetMapping("/get-by-genre-cost-hql")
    public List<BookResponse> getBooksByGenreAndCostGreaterThanHQL(@RequestParam("genre") Genre genre,
                                                                   @RequestParam("cost") double cost){
        return bookService.getBooksByGenreAndCostGreaterThanHQL(genre,cost);

    }

    @DeleteMapping("/delete/book")
    public ResponseEntity deleteBook(@RequestParam int bookId)
    {
        bookService.deleteBook(bookId);
        return new ResponseEntity("Book Deleted Sucessfully", HttpStatus.CREATED);
    }


}

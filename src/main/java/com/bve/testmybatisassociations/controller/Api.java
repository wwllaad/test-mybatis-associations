package com.bve.testmybatisassociations.controller;


import com.bve.testmybatisassociations.model.Book;
import com.bve.testmybatisassociations.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Api {

    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public Book getBookById(@RequestParam int id){
        return bookService.getBookById(id);
    }
}

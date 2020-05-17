package com.eum602.firstApp.controllers;

import com.eum602.firstApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //spring stereotype which tells spring to take it to spring MVC controller.
public class BookController {
    private final BookRepository bookRepository; //inject the book repository.

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books") //invoked when visiting url books. Method invoked by the spring mvc framework
    public String getBooks(Model model){//configuring spring to provide a model
        model.addAttribute("books",bookRepository.findAll());//find and return all books to "books" attribute.
        return "books/list";//return list.html under resources/books
    }
}

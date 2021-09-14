package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Book;
import com.javatechie.crud.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book Book) {
        return service.saveBook(Book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody List<Book> Books) {
        return service.saveBooks(Books);
    }

    @GetMapping("/Books")
    public List<Book> findAllBooks() {
        return service.getBooks();
    }

    @GetMapping("/BookById/{id}")
    public Book findBookById(@PathVariable int id) {
        return service.getBookById(id);
    }

    @GetMapping("/Book/{name}")
    public Book findBookByName(@PathVariable String name) {
        return service.getBookByName(name);
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book Book) {
        return service.updateBook(Book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        return service.deleteBook(id);
    }
}

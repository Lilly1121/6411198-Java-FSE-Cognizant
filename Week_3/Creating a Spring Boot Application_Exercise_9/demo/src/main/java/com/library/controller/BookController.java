package com.library.controller;

import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository repo;

    @GetMapping
    public List<Book> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repo.save(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book book) {
        book.setId(id);
        return repo.save(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        repo.deleteById(id);
    }
}

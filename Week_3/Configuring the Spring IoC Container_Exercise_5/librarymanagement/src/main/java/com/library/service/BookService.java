package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String title;

    // ✅ Constructor Injection
    public BookService(String title) {
        this.title = title;
    }

    // ✅ Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("[" + title + "] Book: " + bookRepository.getBookTitle());
    }
}

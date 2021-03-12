package com.model;

import com.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private final String name;
    private final String surname;
    private List<Book> borrowedBooks;

    public Reader(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.borrowedBooks = new ArrayList<>();
    }
}

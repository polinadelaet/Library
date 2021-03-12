package com.library;

import org.springframework.stereotype.Component;

public class Librarian {
    private final String name;
    private final Library library;

    public Librarian(String name, Library library) {
        this.name = name;
        this.library = library;
    }


}

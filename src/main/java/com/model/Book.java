package com.model;

public class Book {
    private final String title;
    private final String author;
    private String pressmark;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPressmark() {
        return pressmark;
    }

    public void setPressmark(String pressmark) {
        this.pressmark = pressmark;
    }
}

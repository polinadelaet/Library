package com.library;

public class Library {

    private LibraryService libraryService;

    public Library() {
        this.libraryService = new LibraryService();
    }

    public LibraryService getLibraryService() {
        return libraryService;
    }
}

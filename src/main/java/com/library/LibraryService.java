package com.library;

import com.book.Book;
import com.entities.BookEntity;
import com.entities.ReaderEntity;
import com.repository.BookRepository;
import com.repository.ReaderRepository;
import com.utils.PressmarkGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
public class LibraryService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private ReaderRepository readerRepository;

    public void addBook(Book book) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setTitle(book.getTitle());
        bookEntity.setAuthor(book.getAuthor());
        bookEntity.setPressmark(PressmarkGenerator.generatePressmark());
        bookEntity.setCopies(book.getCopies());
        bookEntity.setIssued(0);
        bookEntity.setReaders(new LinkedList<ReaderEntity>());
        bookRepository.save(bookEntity);
    }

    public void removeBook(String title, String author) {
        BookEntity targetBook = bookRepository.findByTitleAndAuthor(title, author);
        bookRepository.delete(targetBook);
    }

   public BookEntity lendOutBook(String title, String author) {
       BookEntity targetBook = bookRepository.findByTitleAndAuthor(title, author);
       if (targetBook != null) {
           targetBook.setIssued(targetBook.getIssued() + 1);
           bookRepository.save(targetBook);
       }
       return targetBook; //TODO: сделать у вызывающего метода проверку на null
   }

    public void acceptBookFromReader(Book book) {
        BookEntity targetBook = bookRepository.findByTitleAndAuthor(book.getTitle(), book.getAuthor());
        targetBook.setIssued(targetBook.getIssued() - 1);
        bookRepository.save(targetBook);
    }

    public boolean addReader(String name, String surname) {
        if (readerRepository.findByNameAndSurname(name, surname) != null) {
            return false;
        }
        ReaderEntity readerEntity = new ReaderEntity();
        readerEntity.setName(name);
        readerEntity.setSurname(surname);
        readerRepository.save(readerEntity);
        return true; //TODO: сделать у вызывающего метода проверку на true/false
    }


}

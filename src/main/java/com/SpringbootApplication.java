package com;

import com.book.Book;
import com.entities.BookEntity;
import com.entities.ReaderEntity;
import com.repository.BookRepository;
import com.utils.PressmarkGenerator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.context.annotation.Bean;

import java.util.LinkedList;

@EntityScan("com/*")
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}

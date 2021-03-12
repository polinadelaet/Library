package com.dbEntities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "books")
public class BookEntity {

    private static final long serialVersionUID = 7235443625362L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int book_id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "pressmark")
    private String pressmark;

    @Column(name = "copies")
    private int copies;

    @Column(name = "issued")
    private int issued; // сколько было выдано книг

    @ManyToMany(mappedBy = "books")
    private List<ReaderEntity> readers;
}

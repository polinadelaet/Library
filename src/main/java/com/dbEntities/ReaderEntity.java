package com.dbEntities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Data
@Entity
@Table(name = "readers")
public class ReaderEntity implements Serializable {

    private static final long serialVersionUID = 723253625362L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reader_id")
    private int reader_id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "book_reader",
                joinColumns = @JoinColumn(name = "reader_id"),
                inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<BookEntity> books;
}

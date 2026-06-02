package com.evandrossj.library.infraestructure.persistence;


import com.evandrossj.library.application.ports.BookRepository;
import com.evandrossj.library.domain.model.Book;
import org.springframework.stereotype.Repository;

import java.util.Optional;


//library/infraestructure/persistence/BookRepositoryImpl.java
@Repository
public class BookRepositoryImpl implements BookRepository {

    private final JPABookRepository jpa;
    private final BookMapper mapper;


    public BookRepositoryImpl(JPABookRepository jpa, BookMapper mapper) {
        this.jpa = jpa;
        this.mapper = mapper;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return jpa.findById(id).map(mapper::toDomain);
    }

    @Override
    public void save(Book book) {
        jpa.save(mapper.toEntity(book));

    }
}

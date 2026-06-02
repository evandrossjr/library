package com.evandrossj.library.application.ports;

import com.evandrossj.library.domain.model.Book;

import java.util.Optional;

//library/application/ports/BookRepository
public interface BookRepository {
    Optional<Book> findById(Long id);
    void save (Book book);
}

package com.evandrossj.library.application.usecases;


import com.evandrossj.library.application.ports.BookRepository;
import com.evandrossj.library.domain.model.Book;
import com.evandrossj.library.domain.model.BookLoan;
import com.evandrossj.library.domain.model.User;

import java.time.LocalDate;

//library/application/usecases/LendBookUseCase
public class LendBookUseCase {

    private final BookRepository bookRepository;

    public LendBookUseCase(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookLoan execute(Long bookId, User user){
        Book book = bookRepository.findById(bookId)
                .orElseThrow(()-> new RuntimeException("Livro não encontrado"));

        book.lend();
        bookRepository.save(book);

        return new BookLoan(null, book, user, LocalDate.now());
    }
}

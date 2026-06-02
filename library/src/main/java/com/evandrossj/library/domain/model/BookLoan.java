package com.evandrossj.library.domain.model;

import java.time.LocalDate;
//library/domain/model/BookLoan.java
public class BookLoan {
    Long id;
    private Book book;
    private User user;
    private LocalDate loanDate;

    public BookLoan(Long id, Book book, User user, LocalDate loanDate) {
        this.id = id;
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
    }
}

package com.evandrossj.library.domain.model;

//library/domain/model/Book.java
public class Book {
    private Long id;
    private String tutle;
    private Integer stock;

    public void lend(){
        if (stock <= 0){
            throw new RuntimeException("Livro indisponível para empréstimo");
        }
        stock--;
    }
}

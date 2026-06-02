package com.evandrossj.library.domain.model;

//library/domain/model/Book.java
public class Book {
    private Long id;
    private String title;
    private Integer stock;

    public Book(Long id, String title, Integer stock) {
        this.id = id;
        this.title = title;
        this.stock = stock;
    }

    public void lend(){
        if (stock <= 0){
            throw new RuntimeException("Livro indisponível para empréstimo");
        }
        stock--;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}

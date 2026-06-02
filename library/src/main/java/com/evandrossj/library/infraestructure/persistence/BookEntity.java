package com.evandrossj.library.infraestructure.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

import javax.annotation.processing.Generated;


//library/infraestructure/persistence/BookEntity.java
@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer stock;

    public BookEntity(Long id, String title, Integer stock) {
        this.id = id;
        this.title = title;
        this.stock = stock;
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

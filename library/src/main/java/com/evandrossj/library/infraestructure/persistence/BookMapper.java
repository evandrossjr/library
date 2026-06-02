package com.evandrossj.library.infraestructure.persistence;

import com.evandrossj.library.domain.model.Book;
import org.springframework.stereotype.Component;


//library/infraestructure/persistence/BookMapper.java
@Component
public class BookMapper {
    public Book toDomain(BookEntity entity) {
        return new Book(entity.getId(), entity.getTitle(), entity.getStock());
    }

    public BookEntity toEntity(Book book){
        return new BookEntity(book.getId(), book.getTitle(), book.getStock());
    }
}

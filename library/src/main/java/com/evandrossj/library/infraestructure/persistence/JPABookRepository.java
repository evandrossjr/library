package com.evandrossj.library.infraestructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

//library/infraestructure/persistence/JPABookRepository.java
public interface JPABookRepository extends JpaRepository<BookEntity, Long> {
}

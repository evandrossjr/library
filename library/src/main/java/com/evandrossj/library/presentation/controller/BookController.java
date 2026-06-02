package com.evandrossj.library.presentation.controller;


import com.evandrossj.library.application.usecases.LendBookUseCase;
import com.evandrossj.library.domain.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//library/presentation/controller/
@RestController
@RequestMapping("/books")
public class BookController {

    private final LendBookUseCase lendBookUseCase;

    public BookController(LendBookUseCase lendBookUseCase) {
        this.lendBookUseCase = lendBookUseCase;
    }

    @PostMapping("/{book}/lend")
    public ResponseEntity<String> lend(@PathVariable Long bookId, @RequestBody User user) {
        lendBookUseCase.execute(bookId, user);
        return ResponseEntity.ok("Empréstimo registrado");
    }
}

package dev.patika.library.dao;

import dev.patika.library.entities.BookBorrowing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookBorrowingRepo extends JpaRepository<BookBorrowing ,Integer> {
}

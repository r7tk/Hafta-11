package dev.patika.library.dao;

import dev.patika.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book ,Integer> {
}

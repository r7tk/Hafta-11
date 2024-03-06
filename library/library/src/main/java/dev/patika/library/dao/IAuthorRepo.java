package dev.patika.library.dao;

import dev.patika.library.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepo extends JpaRepository<Author ,Integer> {
}

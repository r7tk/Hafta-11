package dev.patika.library.dao;

import dev.patika.library.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepo extends JpaRepository<Category, Integer> {
}

package dev.patika.library.dao;


import dev.patika.library.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublisherRepo extends JpaRepository<Publisher, Integer> {
}

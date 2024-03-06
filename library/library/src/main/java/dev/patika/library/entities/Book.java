package dev.patika.library.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private long id;

    @NotNull
    @Column(name = "book_name")
    private String name;

    @NotNull
    @Column(name = "book_publication_year")
    private int publication_year;

    @NotNull
    @Column(name = "book_stock")
    private int stock;
}

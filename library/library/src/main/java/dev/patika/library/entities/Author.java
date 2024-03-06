package dev.patika.library.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "author")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id",columnDefinition = "serial")
    private long id;

    @NotNull
    @Column(name = "author_name")
    private String name;

    @Column(name = "author_birth_date")
    private LocalDate birth_date;

    @Column(name = "author_country")
    private String country;
}

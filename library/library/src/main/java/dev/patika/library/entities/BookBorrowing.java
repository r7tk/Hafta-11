package dev.patika.library.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bookborrowing")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_borrowing_id" , columnDefinition = "serial")
    private long id;

    @NotNull
    @Column(name = "borrower_name")
    private String borrower_name;

    @NotNull
    @Column(name = "borrow_date")
    private LocalDate borrowing_date;

    @Column(name = "borrow_mail")
    private String borrow_mail;

    @NotNull
    @Column(name = "borrow_return_date")
    private LocalDate return_date;
}

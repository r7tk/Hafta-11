package dev.patika.spring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.SplittableRandom;

@Entity
@Table(name = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id",length = 10,columnDefinition = "serial")
    private int id;

    @Column(name = "customer_name", nullable = false,length = 20)
    private String name;

    @Column(name = "customer_mail", nullable = false, unique = true)
    private String mail;

    @Temporal(TemporalType.DATE)// Bu ne
    @Column(name = "customer_on_date")
    private LocalDate onDate;

    @Enumerated(EnumType.STRING) // Bu ne
    @Column(name = "customer_gender")
    private Gender gender;

    public enum Gender{
        MALE,
        FEMALE
    }
}

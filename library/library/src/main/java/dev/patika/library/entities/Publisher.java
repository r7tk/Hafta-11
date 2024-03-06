package dev.patika.library.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "publisher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publisher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id",columnDefinition = "serial")
    private long id;

    @Column(name = "publisher_name")
    private String name;

    @Column(name = "publisher_establishment_year")
    private int establishment_year;

    @Column(name = "publisher_adress")
    private String address;
}

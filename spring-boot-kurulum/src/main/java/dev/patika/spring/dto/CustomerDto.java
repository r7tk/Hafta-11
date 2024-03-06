package dev.patika.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// Customer -> CustomerDto
public class CustomerDto {
    private int id;
    private String name;
    private String mail;
}

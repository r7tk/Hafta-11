package dev.patika.spring.business.abstracts;

import dev.patika.spring.entities.Customer;

import java.util.List;

public interface ICostumerServices {
    Customer getByID(int id);

    Customer save(Customer customer);

    Customer update(Customer customer);

    void delete(int id);

    List<Customer> findAll();
}

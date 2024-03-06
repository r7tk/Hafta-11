package dev.patika.spring.business.concretes;

import dev.patika.spring.business.abstracts.ICostumerServices;
import dev.patika.spring.dao.CustomerRepo;
import dev.patika.spring.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumerManager implements ICostumerServices {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer getByID(int id) {
        return this.customerRepo.findById(id).orElseThrow();
    }

    @Override
    public Customer save(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public Customer update(Customer customer) {
        return this.customerRepo.save(customer);
    }

    @Override
    public void delete(int id) {

        this.customerRepo.delete(this.getByID(id));
    }

    @Override
    public List<Customer> findAll() {
        return this.customerRepo.findAll();
    }
}

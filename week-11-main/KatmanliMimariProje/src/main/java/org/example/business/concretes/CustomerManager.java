package org.example.business.concretes;

import org.example.business.abstracts.ICustomerService;
import org.example.dao.abstracts.ICustomerDao;
import org.example.entities.Customer;

import java.util.List;

public class CustomerManager implements ICustomerService {

    private final ICustomerDao customerDao;

    public CustomerManager(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        Customer checkCustomer = this.customerDao.//Buradasın!!!!!!!!!!!!!!!!!!!!!!!
    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Customer> findAll() {
        return null;
    }
}

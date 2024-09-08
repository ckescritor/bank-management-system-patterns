package com.example.bank.service;

import com.example.bank.model.Customer;
import com.example.bank.repository.CustomerRepository;

public class CustomerService {
    private CustomerRepository customerRepository = new CustomerRepository();

    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer findCustomerById(String id) {
        return customerRepository.findById(id);
    }
}

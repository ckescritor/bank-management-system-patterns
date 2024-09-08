package com.example.bank.repository;

import com.example.bank.model.Customer;
import java.util.HashMap;
import java.util.Map;

public class CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer findById(String id) {
        return customers.get(id);
    }
}

package com.example.apartmentweb.customer.service;

import com.example.apartmentweb.customer.model.CustomerModel;
import com.example.apartmentweb.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerModel> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<CustomerModel> findCustomerById(UUID id) {
        return customerRepository.findById(id);
    }

    public CustomerModel saveCustomer(CustomerModel customer) {
        return customerRepository.save(customer);
    }

    public void deleteCustomer(UUID id) {
        customerRepository.deleteById(id);
    }

}



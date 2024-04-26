package com.example.apartmentweb.customer.repository;

import com.example.apartmentweb.customer.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerModel, UUID> {
}


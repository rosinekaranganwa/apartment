package com.example.apartmentweb.customer.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "customers")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customerId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    @Column(unique = true)
    private String email;
    private String phone;
    private String password;
}

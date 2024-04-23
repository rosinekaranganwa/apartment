package com.example.apartment.customer.model;

import com.example.apartment.address.model.AddressModel;
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
    @OneToMany
    @JoinColumn(name="addressId")
    private List<AddressModel> address;
}


package com.example.apartment.employee.model;

import com.example.apartment.address.model.AddressModel;
import com.example.apartment.building.model.BuildingModel;
import com.example.apartment.customer.model.CustomerModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    private UUID employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    @OneToMany
    @JoinColumn(name = "addressId")
    private List<AddressModel> address;
    @OneToMany
    @JoinColumn(name = "buildingId")
    private List<BuildingModel> building;
    @OneToMany
    @JoinColumn(name = "customerId")
    private List<CustomerModel> customer;

}

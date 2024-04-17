package com.example.apartment.employee.model;

import com.example.apartment.address.model.AddressModel;
import com.example.apartment.building.model.BuildingModel;
import com.example.apartment.customer.model.CustomerModel;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UUID getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(UUID employeeId) {
        this.employeeId = employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<AddressModel> getAddress() {
        return address;
    }

    public void setAddress(List<AddressModel> address) {
        this.address = address;
    }

    public List<BuildingModel> getBuilding() {
        return building;
    }

    public void setBuilding(List<BuildingModel> building) {
        this.building = building;
    }

    public List<CustomerModel> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerModel> customer) {
        this.customer = customer;
    }
}

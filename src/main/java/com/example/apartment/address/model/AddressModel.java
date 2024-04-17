package com.example.apartment.address.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "addresses")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID address_id;
    private String street;
    private String city;
    private String province;
    private String country;

    public UUID getAddress_id() {
        return address_id;
    }

    public void setAddress_id(UUID addressId) {
        this.address_id = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

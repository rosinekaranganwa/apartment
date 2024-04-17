package com.example.apartment.apatservice.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "amenties")
public class ServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID service_id;
    private String name;

    public UUID getService_id() {
        return service_id;
    }

    public void setService_id(UUID serviceId) {
        this.service_id = serviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.example.apartment.amenties.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.rmi.server.UID;

@Entity
@Table(name = "amenties")
public class ServiceModel {
    @Id
    private UID serviceId;
    private String name;
}

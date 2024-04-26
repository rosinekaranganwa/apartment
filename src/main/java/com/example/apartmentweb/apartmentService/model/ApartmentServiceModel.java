package com.example.apartmentweb.apartmentService.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "amenties")
public class ApartmentServiceModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID serviceId;
    private String name;
}
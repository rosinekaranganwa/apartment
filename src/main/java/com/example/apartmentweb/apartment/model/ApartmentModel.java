package com.example.apartmentweb.apartment.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "apartments")
public class ApartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID apartmentId;
    private String name;
    private String numberOfRooms;
    private int pricePerNight;
    private String address;
    private String status;
}
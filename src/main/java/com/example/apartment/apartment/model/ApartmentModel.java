package com.example.apartment.apartment.model;

import com.example.apartment.photo.model.PhotoModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
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
    private String photoId;

    @OneToMany
    @JoinColumn(name = "photoId")
    private List<PhotoModel> photos;


}

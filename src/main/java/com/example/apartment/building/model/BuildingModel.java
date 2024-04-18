package com.example.apartment.building.model;

import com.example.apartment.address.model.AddressModel;
import com.example.apartment.apartment.model.ApartmentModel;
import com.example.apartment.apatservice.model.ServiceModel;
import com.example.apartment.photo.model.PhotoModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "building")
public class BuildingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID buildingId;
    private String numberOfFloor;
    private String numberOfRoom;
    private String parkingAvailability;
    private String utilities;
    private String accessibilityFeatures;
    @OneToMany
    @JoinColumn(name = "photoId")
    private List<PhotoModel> photo;
    @OneToMany
    @JoinColumn(name = "apartmentId")
    private List<ApartmentModel> apartment;
    @OneToOne
    @JoinColumn(name="addressId")
    private AddressModel address;
    @OneToMany
    @JoinColumn(name="serviceId")
    private List<ServiceModel> service;

}

package com.example.apartment.building.model;

import com.example.apartment.address.model.AddressModel;
import com.example.apartment.apartment.model.ApartmentModel;
import com.example.apartment.apatservice.model.ServiceModel;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "building")
public class BuildingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID building_id;
    private String numberOfFloor;
    private String numberOfRoom;
    @OneToMany
    @JoinColumn(name = "apartment_id")
    private List<ApartmentModel> apartment;
    @OneToOne
    @JoinColumn(name="address_id")
    private AddressModel address;
    @OneToMany
    @JoinColumn(name="service_id")
    private List<ServiceModel> service;

    public UUID getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(UUID building_id) {
        this.building_id = building_id;
    }

    public String getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(String numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public List<ApartmentModel> getApartment() {
        return apartment;
    }

    public void setApartment(List<ApartmentModel> apartment) {
        this.apartment = apartment;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }

    public List<ServiceModel> getService() {
        return service;
    }

    public void setService(List<ServiceModel> service) {
        this.service = service;
    }
}

package com.example.apartment.apartment.model;

import com.example.apartment.photo.model.PhotoModel;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;
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
    @JoinColumn(name = "photo_id")
    private List<PhotoModel> photos;

    public UUID getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(UUID apartmentId) {
        this.apartmentId = apartmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(String numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

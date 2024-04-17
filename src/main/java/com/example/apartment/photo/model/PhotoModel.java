package com.example.apartment.photo.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "photos")
public class PhotoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID photoId;
    @Lob
    private byte[] images;

    public UUID getPhotoId() {
        return photoId;
    }

    public void setPhotoId(UUID photoId) {
        this.photoId = photoId;
    }

    public byte[] getImages() {
        return images;
    }

    public void setImages(byte[] images) {
        this.images = images;
    }
}

package com.example.apartmentweb.apartmentService.repository;

import com.example.apartmentweb.apartment.model.ApartmentModel;
import com.example.apartmentweb.apartmentService.model.ApartmentServiceModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApartmentServiceRepository extends JpaRepository<ApartmentServiceModel,UUID>{
}
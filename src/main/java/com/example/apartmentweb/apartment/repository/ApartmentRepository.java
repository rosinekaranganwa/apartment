package com.example.apartmentweb.apartment.repository;

import com.example.apartmentweb.address.model.AddressModel;
import com.example.apartmentweb.apartment.model.ApartmentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApartmentRepository extends JpaRepository<ApartmentModel,UUID>{
}

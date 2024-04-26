package com.example.apartmentweb.apartment.service;

import com.example.apartmentweb.address.model.AddressModel;
import com.example.apartmentweb.address.repository.AddressRepository;
import com.example.apartmentweb.apartment.model.ApartmentModel;
import com.example.apartmentweb.apartment.repository.ApartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ApartmentService {
    @Autowired
    private ApartmentRepository apartmentRepository;

    public List<ApartmentModel> findAllApartments() {
        return apartmentRepository.findAll();
    }

    public Optional<ApartmentModel> findApartmentById(UUID id) {
        return apartmentRepository.findById(id);
    }

    public ApartmentModel saveApartment(ApartmentModel apartment) {
        return apartmentRepository.save(apartment);
    }

    public void deleteApartment(UUID id) {
        apartmentRepository.deleteById(id);
    }
}

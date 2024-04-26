package com.example.apartmentweb.apartmentService.service;
import com.example.apartmentweb.apartmentService.model.ApartmentServiceModel;
import com.example.apartmentweb.apartmentService.repository.ApartmentServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Service
public class ApartmentService {
    @Autowired
    private ApartmentServiceRepository apartmentServiceRepository;

    public List<ApartmentServiceModel> findAllApartmentsService() {
        return apartmentServiceRepository.findAll();
    }

    public Optional<ApartmentServiceModel> findApartmentServiceById(UUID id) {
        return apartmentServiceRepository.findById(id);
    }

    public ApartmentServiceModel saveApartmentService(ApartmentServiceModel apartmentService) {
        return apartmentServiceRepository.save(apartmentService);
    }

    public void deleteApartmentService(UUID id) {
        apartmentServiceRepository.deleteById(id);
    }
}

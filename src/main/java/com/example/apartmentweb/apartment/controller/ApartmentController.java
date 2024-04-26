package com.example.apartmentweb.apartment.controller;
import com.example.apartmentweb.apartment.model.ApartmentModel;
import com.example.apartmentweb.apartment.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("/apartment")
public class ApartmentController {
    @Autowired
    private ApartmentService apartmentService;

    @GetMapping
    public List<ApartmentModel> getAllApartments() {
        return apartmentService.findAllApartments();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApartmentModel> getApartmentById(@PathVariable UUID id) {
        return apartmentService.findApartmentById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ApartmentModel createApartment(@RequestBody ApartmentModel apartment) {
        return apartmentService.saveApartment(apartment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApartment(@PathVariable UUID id) {
        apartmentService.deleteApartment(id);
        return ResponseEntity.ok().build();
    }
}


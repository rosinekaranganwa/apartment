package com.example.apartmentweb.address.service;

import com.example.apartmentweb.address.model.AddressModel;
import com.example.apartmentweb.address.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<AddressModel> findAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<AddressModel> findAddressById(UUID id) {
        return addressRepository.findById(id);
    }

    public AddressModel saveAddress(AddressModel address) {
        return addressRepository.save(address);
    }

    public void deleteAddress(UUID id) {
        addressRepository.deleteById(id);
    }
}

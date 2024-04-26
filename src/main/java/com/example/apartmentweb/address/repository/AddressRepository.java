package com.example.apartmentweb.address.repository;

import com.example.apartmentweb.address.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressModel, UUID> {
}

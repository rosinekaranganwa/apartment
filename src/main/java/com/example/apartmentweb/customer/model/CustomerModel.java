package com.example.apartmentweb.customer.model;
import com.example.apartmentweb.address.model.AddressModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "customers")
public class CustomerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID customerId;
    @NotBlank(message="First name must not be empty")
    @Size(min=3,max=50,message="First name must be between 3 and 50 characters")
    private String firstName;
    @NotBlank(message="Last name must not be empty")
    @Size(min=3,max=50,message="Last name must be between 3 and 50 characters")
    private String lastName;
    private Date dateOfBirth;
    @Column(unique = true)
    private String email;
    private String phone;
    @NotBlank(message = "Password must not be empty")
    @Size(min = 8, message = "Password must have at least 8 characters")
    private String password;
    @ManyToOne
    @JoinColumn(name = "addressId")
    private AddressModel address;
}



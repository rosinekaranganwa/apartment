package com.example.apartment.review.model;
import com.example.apartment.customer.model.CustomerModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "review")
public class ReviewModel {
    @Id
    private UUID reviewId;
    private String comments;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerModel customer;
}
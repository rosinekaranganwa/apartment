package com.example.apartment.payment.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "payment")
public class PaymentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID paymentId;
    private int amount;
    private Date paymentDate;
    private String paymentMethod;
    private String paymentStatus;
    private String paymentReference;
}

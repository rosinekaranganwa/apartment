package com.example.apartment.booking.model;

import com.example.apartment.payment.model.PaymentModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;
@Getter
@Setter
@Entity
@Table(name = "booking")
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID bookingId;
    private Date checkInDate;
    private Date checkOutDate;
    private int totalPrice;
    private String status;
    @OneToOne
    @JoinColumn(name = "paymentId")
    private PaymentModel payment;
}

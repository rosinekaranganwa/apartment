package com.example.apartment.booking.model;

import com.example.apartment.payment.model.PaymentModel;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "booking")
public class BookingModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID booking_id;
    private Date checkInDate;
    private Date checkOutDate;
    private int totalPrice;
    private String status;
    @OneToOne
    @JoinColumn(name = "paymentId")
    private PaymentModel payment;

    public UUID getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(UUID booking_id) {
        this.booking_id = booking_id;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

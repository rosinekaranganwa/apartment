package com.example.apartment.review.model;
import com.example.apartment.customer.model.CustomerModel;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "review")
public class ReviewModel {
    @Id
    private UUID reviewId;
    private String comments;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private CustomerModel customer;

    public UUID getReviewId() {
        return reviewId;
    }

    public void setReviewId(UUID reviewId) {
        this.reviewId = reviewId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public CustomerModel getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerModel customer) {
        this.customer = customer;
    }
}
package Model;

import java.util.Scanner;

import Service.Generator;

public class Payment {
    private String paymentId;
    private String bookingId;
    private Double amount; 
    private String Status;

    
    public Payment(String paymentId, String bookingId, Double amount, String status) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.amount = amount;
        Status = status;
    }

    
    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", amount=" + amount + ", Status="
                + Status + "]";
    }


    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
}

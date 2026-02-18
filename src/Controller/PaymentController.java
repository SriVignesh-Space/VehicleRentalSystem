package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Bookings;
import Model.Payment;
import Service.Generator;

public class PaymentController {

    Scanner sc;
    List<Payment> payments;

    PaymentController(Scanner sc){
        this.sc = sc;
        this.payments = new ArrayList<>();
    }

    public boolean AuthorizePayment(Bookings bookings, double amount){
        System.out.println("Pay: Rs " + amount);
        System.out.println("Authorize Payment : (y/n)");
        String s = sc.nextLine();
        if(s.equalsIgnoreCase("y")) {
            String id = Generator.generate_id();
            Payment payment = new Payment(id, bookings.getBookingId(), amount, "Paid");
            bookings.setPaymentId(payment.getPaymentId());
            payments.add(payment);
            System.out.println("Payment Successfull");
            return true;
        }
        else return false;
    }
}

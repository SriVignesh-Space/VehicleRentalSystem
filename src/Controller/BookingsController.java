package Controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.BookingTimes;
import Model.Bookings;
import Model.Customer;
import Model.Vehicle;
import Service.DateTimeService;
import Service.Generator;

public class BookingsController {
    Scanner sc = null;
    VehicleController vehicleController;
    PaymentController paymentController;
    Scheduler scheduler;
    List<Bookings> bookings;
    List<Vehicle> vehicles;

    public BookingsController(Scanner sc){
        this.sc = sc;
        this.vehicleController = new VehicleController(sc);
        bookings = new ArrayList<>();
        scheduler = new Scheduler();
        paymentController = new PaymentController(sc);
    }

    public BookingTimes getVehicleAtTime(){
        System.out.println("Enter the booking date: (yyyy-mm-dd) ");
        String date = sc.nextLine().trim();
        System.out.println("Enter the booking time: (hh:mm) ");
        String time = sc.nextLine().trim();
        System.out.println("Enter the Duration : (in hrs)");
        int Duration = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the type of Vehicle : (bike/car)");
        String type = sc.nextLine().trim();

        String timeString = date + " " + time;
        LocalDateTime dateTime = DateTimeService.check(timeString);
        if(dateTime == null){
            System.out.println("invalid date time");
            return null;
        }
        BookingTimes bt = new BookingTimes(dateTime, dateTime.plusHours(Duration),dateTime.toLocalDate(), Duration);
        boolean flag = false;
        vehicles = vehicleController.getAllVehicles();
        System.out.println( "Vehicles no : " + vehicles.size());
        for(Vehicle vehicle : vehicles){
            if(dateTime.isAfter(LocalDateTime.now()) && vehicle.getType().equalsIgnoreCase(type) && scheduler.isAvailable(vehicle, bt)){
                System.out.println(vehicle.toString());
                flag = true;
            }
        }
        if(!flag) {
            System.out.println("No Vehicles at this time");
            return null;
        }
        return bt;
    }

    public void RentVehicle(Customer customer){
        System.out.println("Renting Page");
        System.out.println("Listing Vehicles");

        BookingTimes bt = getVehicleAtTime();
        Vehicle vehicle = null;

        if(bt == null){
            return ;
        }
        System.out.println("Enter the Vehicle id to book : ");
        String id = sc.nextLine();
        
        for(Vehicle v : vehicles){
            if(v.getVehicleId().equals(id)) vehicle = v;
        }
        if(vehicle == null) {
            System.out.println("Vehicle not found");
            return ;
        }
        // i have to embed payment Proxy
        double amount = vehicle.getPrice() * bt.getDuration();
        System.out.println("Total Payable : "+ amount);
        System.out.println("Enter yes to continue payment : ");
        String choice = sc.nextLine();
        Bookings booking = null;
        if(choice.equalsIgnoreCase("yes")){
            String bid = Generator.generate_id();
            booking = new Bookings(bid, bt.getStartTime().toString(), bt.getEndTime().toString(), bt.getDuration(), "", customer.getCustomerId());
            if(paymentController.AuthorizePayment(booking, amount))
            {
                bookings.add(booking);
                vehicle.getBooked_time().add(bt);
                customer.getbookings().add(booking);
            }
        }
        System.out.println(id + " Booked Successfully");
    }

    public void getAllBookings(){
        for(Bookings booking : bookings){
            System.out.println(booking.toString());
        }
    }
}

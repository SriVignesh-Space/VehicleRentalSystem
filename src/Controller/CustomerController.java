package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Bookings;
import Model.Customer;
import Service.Generator;

public class CustomerController {
    Scanner sc = null;
    List<Customer> customers =null;
    BookingsController bookingsController;

    public CustomerController(Scanner sc){
        this.sc = sc;
        this.customers = new ArrayList<>();
        bookingsController = new BookingsController(sc);
    }

    public void addCustomer(){
        System.out.println("Register Customer");
        System.out.println("Enter username: ");
        String name = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        System.out.println("Enter Aadhar number: ");
        String aadhar = sc.nextLine();
        System.out.println("Enter License number: ");
        String licence = sc.nextLine();
        System.out.println("Enter Phone number: ");
        String phone = sc. nextLine();
        String id = Generator.generate_id();
        Customer customer = new Customer(id, name, aadhar, licence, phone, password);
        customers.add(customer);
        System.out.println("Registration successful");
    }

    public Customer validateCustomer(){
        System.out.println("Login");
        System.out.println("Enter username");
        String name = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        for(Customer customer : customers){
            if(customer.getCustomerName().equals(name) && customer.getPassword().equals(password)){
                return customer;
            }
        }
        return null;
    }

    public void getAllBookings(Customer customer){
        for(Bookings booking : customer.getbookings()){
            System.out.println(booking.toString());
        }
    }


    private void customerFeatures(Customer customer) {
        // search for vehicles

        // book vehicles
        boolean running = true;
        while(running){
            System.out.println("Main Page");
            System.out.println("1. Search Vehicle");
            System.out.println("2. Rent Vehicle");
            System.out.println("3. Get all Bookings");
            System.out.println("4. back to main menu");
            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    bookingsController.getVehicleAtTime();
                    break;
                case 2:
                    bookingsController.RentVehicle(customer);
                    break;
                case 3:
                    getAllBookings(customer);
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    break;
            }
        }
    }

    public void handle(){
        Customer customer = null;   
        boolean running = true;
        while(running){
            System.out.println("Customer Page");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Back to Main Menu");

            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    addCustomer();
                    break;  
                case 2:{
                    customer = validateCustomer();
                    if(customer != null) {
                        System.out.println("Login successfull");
                        customerFeatures(customer);  
                    }
                    break;
                }
                case 3:
                    running = false;
                    break;
                default:{
                    System.out.println("Invalid Option");
                    break;
                }
            }

        }
    }
}

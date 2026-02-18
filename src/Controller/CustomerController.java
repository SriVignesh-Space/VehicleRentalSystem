package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Customer;
import Service.Generator;

public class CustomerController {
    Scanner sc = null;
    List<Customer> customers =null;

    CustomerController(Scanner sc){
        this.sc = sc;
        this.customers = new ArrayList<>();
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

    public void handle(){
        Customer customer = null;   
        boolean running = true;
        while(running){
            System.out.println("Customer Page");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Back to Main Menu");

            int option = sc.nextInt();
            switch (option) {
                case 1:
                    
                    break;
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

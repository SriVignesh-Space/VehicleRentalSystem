package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Admin;
import Model.Vehicle;

public class AdminController {

    private List<Admin> adminDb = new ArrayList<>();
    Scanner sc = null;
    VehicleController vehicleController;

    public AdminController(Scanner sc){
        this.sc = sc;
        this.vehicleController = new VehicleController(sc);
    }
    
    public void displayVehicles(){
        List<Vehicle> vehicles = vehicleController.getAllVehicles();
        System.out.println("all Vehicles " + vehicles.size());
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.toString());
        }
    }

    public void handle(){
        adminDb.add(new Admin("admin", "1234"));
        Admin adminUser = null;
        boolean running=true;

        System.out.println("Admin Login");
        System.out.println("press q to get back to main menu");
        System.out.println("Enter username");
        String username=sc.nextLine();
        if(username.equalsIgnoreCase("q")){
            running = false;
            return;
        }
        System.out.println("Enter password");
        String password = sc.nextLine();
        for(Admin admin : adminDb){
        if(admin.getUsername().equals(username) && admin.getPassword().equals(password)){
            adminUser = admin;
        }

        while(running){
            if(adminUser != null){
                System.out.println("Welcome " + adminUser.getUsername());
                System.out.println("1. Create Vehicles");
                System.out.println("2. get Vehicle details");
                System.out.println("3. Delete Vehicle");
                System.out.println("4. Back to main menu");

                System.out.println("Enter your option: ");
                int option = sc.nextInt();
                sc.nextLine();
                switch(option){
                    case 1:{
                        vehicleController.addVehicle();
                        break;
                    }
                    case 2:{
                        displayVehicles();
                        break;
                    }
                    case 3:{
                        vehicleController.deleteVehicle();
                        break;
                    }
                    case 4:{
                        running = false;
                        break;
                    }
                    default:{
                        System.out.println("Invalid User");
                        break;}
                }

            }
            else{
                System.out.println("Admin not found");
                break;
            }
        }
        }

        
    }
}

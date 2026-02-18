package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Admin;

public class AdminController {

    private List<Admin> adminDb = new ArrayList<>();
    Scanner sc = null;
    VehicleController vehicleController;

    AdminController(Scanner sc){
        this.sc = sc;
        this.vehicleController = new VehicleController(sc);
    }
    
    public void handle(){
        adminDb.add(new Admin("admin", "1234"));
        Admin adminUser = null;
        boolean running=true;
        while(running){
            System.out.println("Admin Login");
            System.out.println("press q to get back to main menu");
            System.out.println("Enter username");
            String username=sc.nextLine();
            if(username.equalsIgnoreCase("q")){
                running = false;
                break;
            }
            System.out.println("Enter password");
            String password = sc.nextLine();
            for(Admin admin : adminDb){
            if(admin.getUsername().equals(username) && admin.getPassword().equals(password)){
                adminUser = admin;
            }

            if(adminUser != null){
                System.out.println("Welcome " + adminUser.getUsername());
                System.out.println("1. Create Vehicles");
                System.out.println("2. Update Vehicle details");
                System.out.println("3. Delete Vehicle");
                System.out.println("4. Back to main menu");

                System.out.println("Enter your option: ");
                int option = sc.nextInt();
                switch(option){
                    case 1:{
                        vehicleController.addVehicle();
                        break;
                    }
                    case 2:{
                        vehicleController.getAllVehicles();
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
        }
        }

        
    }
}

package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Vehicle;
import Service.Generator;



public class VehicleController {
    private List<Vehicle> vehicles = new ArrayList<>();
    Scanner sc=null;
    VehicleController(Scanner sc){
        this.sc = sc;
    }

    public void addVehicle(){
        System.out.println("Enter Vehicle Type : ");
        String type = sc.nextLine();
        System.out.println("Enter Vehicle Model : ");
        String model = sc.nextLine();
        System.out.println("Enter Rental Price : ");
        double price = sc.nextDouble();
        System.out.println("Enter Mileage : ");
        double mileage = sc.nextDouble();
        String id = Generator.generate_id();
        Vehicle vehicle = new Vehicle(id,type, model, price, mileage);

        vehicles.add(vehicle);

        System.out.println("Vehicle Added Successfully");
    }

    public void getAllVehicles(){
        for(Vehicle vehicle : vehicles){
            System.out.println(vehicle.toString());
            System.out.println();
            System.out.println();
        }
    }

    public void deleteVehicle(){
        System.out.println("Enter vehicle Id");
        String id = sc.nextLine();
        boolean flag = false;
        for(Vehicle vehicle : vehicles){
            if(vehicle.getVehicleId().equals(id)){
                System.out.println("Vehicle Deleted Successfully");
                System.out.println(vehicle.toString());
                vehicles.remove(vehicle);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("Vehicle Not found");
        }
    }

    public Vehicle searchVehicle(){
        System.out.println("Enter Model : ");
        String model = sc.nextLine();
        for(Vehicle vehicle : vehicles){
            if(vehicle.getModel().equalsIgnoreCase(model)){
                return vehicle;
            }
        }
        return null;
    }
}

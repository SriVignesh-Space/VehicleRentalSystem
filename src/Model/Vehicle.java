package Model;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String vehicleId;
    private String type;
    
    private String model;
    private double price, mileage;
    private List<Long> Booked_time = null;
    private boolean availability;
    
    public Vehicle(String vehicleId, String type, String model, double price, double mileage) {
        this.vehicleId = vehicleId;
        this.type = type;
        this.model = model;
        this.price = price;
        this.mileage = mileage;
        Booked_time = new ArrayList<>();
        this.availability = true;
    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getMileage() {
        return mileage;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public List<Long> getBooked_time() {
        return Booked_time;
    }
    public void setBooked_time(List<Long> booked_time) {
        Booked_time = booked_time;
    }
    public boolean isAvailability() {
        return availability;
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleId=" + vehicleId + ", Type=" + type + ", model=" + model + ", price=" + price
                + ", mileage=" + mileage + ", Booked_time=" + Booked_time + ", availability=" + availability + "]";
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}

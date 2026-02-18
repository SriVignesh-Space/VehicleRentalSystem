package Model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String customerName;
    private String aadharNumber, licenseNumber, phoneNumber, password;
    private List<Bookings> bookings;

    public Customer(String customerId, String customerName, String aadharNumber, String licenseNumber,
            String phoneNumber, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.aadharNumber = aadharNumber;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
        this.bookings = new ArrayList<>();
        this.password = password;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getAadharNumber() {
        return aadharNumber;
    }
    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }
    public String getLicenseNumber() {
        return licenseNumber;
    }
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public List<Bookings> getbookings() {
        return bookings;
    }
    public void setbookings(List<Bookings> bookings) {
        this.bookings = bookings;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", aadharNumber="
                + aadharNumber + ", licenseNumber=" + licenseNumber + ", phoneNumber=" + phoneNumber + ", password="
                + password + ", bookings=" + bookings + "]";
    }
    
}

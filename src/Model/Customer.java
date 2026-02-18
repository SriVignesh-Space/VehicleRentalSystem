package Model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String customerName;
    private String aadharNumber, licenseNumber, phoneNumber, password;
    private List<String> booking_ids;

    public Customer(String customerId, String customerName, String aadharNumber, String licenseNumber,
            String phoneNumber, String password) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.aadharNumber = aadharNumber;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
        this.booking_ids = new ArrayList<>();
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
    public List<String> getBooking_ids() {
        return booking_ids;
    }
    public void setBooking_ids(List<String> booking_ids) {
        this.booking_ids = booking_ids;
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
                + password + ", booking_ids=" + booking_ids + "]";
    }
    
}

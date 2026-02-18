package Model;

public class Bookings {
    private String bookingId;
    private String startTime;
    private int duration;
    private String endTime;
    private String paymentId;
    private String customerId;
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public Bookings(String bookingId, String startTime, String endTime ,int duration, String paymentId, String customerId) {
        this.bookingId = bookingId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
        this.paymentId = paymentId;
        this.customerId = customerId;
    }
    @Override
    public String toString() {
        return "Bookings [bookingId=" + bookingId + ", startTime=" + startTime + ", duration=" + duration + ", endTime="
                + endTime + ", paymentId=" + paymentId + ", customerId=" + customerId + "]";
    }
    public String getBookingId() {
        return bookingId;
    }
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
    public String getStartTime() {
        return startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    
}

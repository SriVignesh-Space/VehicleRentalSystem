package Controller;

import java.util.List;

import Model.BookingTimes;
import Model.Vehicle;

public class Scheduler {
    public boolean isAvailable(Vehicle vehicle, BookingTimes bookingTime){
        List<BookingTimes> bookingTimes = vehicle.getBooked_time();
        if(bookingTimes.size() == 0) return true;
        boolean available = true;
        for(BookingTimes bt : bookingTimes){
            if(bt.getStartTime().isAfter(bookingTime.getEndTime()) || bt.getEndTime().isBefore(bookingTime.getStartTime())){
                available = true;
            }
            else{
                available = false;
            }
        }
        return available;
    }
}

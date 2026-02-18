package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class BookingTimes {
    private LocalDateTime startTime, endTime;
    private LocalDate date;
    private int duration;

    
    public BookingTimes(LocalDateTime startTime, LocalDateTime endTime, LocalDate date, int duration) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "BookingTimes [startTime=" + startTime + ", endTime=" + endTime + ", date=" + date + ", duration="
                + duration + "]";
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public LocalDate getDate() {
        return this.date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
}

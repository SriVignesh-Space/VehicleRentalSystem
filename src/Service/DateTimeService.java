package Service;

import java.time.LocalDateTime;

public class DateTimeService {
    static LocalDateTime dateTime;
    public static LocalDateTime check(String timeString){
        try{
        dateTime = stringToDateTime.convert(timeString);
        return dateTime;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("DateTime Error");
        }
        return null;
    }
}

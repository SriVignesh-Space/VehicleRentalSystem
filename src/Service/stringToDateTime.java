package Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class stringToDateTime {
    public static LocalDateTime convert(String date){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(date, dateTimeFormatter);
    }
}

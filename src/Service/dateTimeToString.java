package Service;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class dateTimeToString {
    public static String convert(LocalDateTime datetime){
        return datetime.toString(); 
        // Arrays.asList(datetime.toString().split("T"));
    }
}

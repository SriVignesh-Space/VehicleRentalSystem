package Service;

import java.util.UUID;

public class Generator {
    public static String generate_id(){
        String res = UUID.randomUUID().toString().replace("-", "").substring(0,6);
        return res;
    }
}

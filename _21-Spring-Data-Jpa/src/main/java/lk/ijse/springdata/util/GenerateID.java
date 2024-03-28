package lk.ijse.springdata.util;

import java.util.UUID;

/**
 * @author : savindaJ
 * @date : 2024-03-28
 * @since : 0.1.0
 **/
public class GenerateID {
    public static String generateID() {
        String prefix = "ITM-";
        return prefix + UUID.randomUUID().toString().split("-")[0];
    }
}

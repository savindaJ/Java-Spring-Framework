package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
@Component
@Qualifier("address")
public class Piyumi implements GirlFriend {

    private String address;

    @Override
    public void loveOnlyMe() {
        System.out.println("love piyumi !");
    }
}

package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
//@Component
public class Piyumi implements GirlFriend {
    @Override
    public void loveOnlyMe() {
        System.out.println("love piyumi !");
    }
}

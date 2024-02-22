package lk.ijse.spring;

import lk.ijse.spring.config.AppConfigOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfigOne.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}

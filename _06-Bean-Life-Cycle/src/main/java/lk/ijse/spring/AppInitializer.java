package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-09
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook(); // help to destroy beans

//                out put
//                app init !
//                Bean one > Instantiate !
//                Bean one > set Bean name Aware !
//                Bean one > set Bean factory !
//                Bean one > set application context !
//                Bean one > after Property set !
//                Bean Two > instantiate !
//                Bean Two > set Bean name Aware !
//                Bean Two > set Bean factory !
//                Bean Two > set application context !
//                Bean Two > after Property set !
//                Bean Two > destroy !
//                Bean one > destroy !
    }
}

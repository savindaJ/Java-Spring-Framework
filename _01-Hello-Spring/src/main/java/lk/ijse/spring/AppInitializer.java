package lk.ijse.spring;

import lk.ijse.spring.bean.SpringBean;
import lk.ijse.spring.bean.SpringBean2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-02
 * @since : 0.1.0
 **/
public class AppInitializer {

    public static void main(String[] args) {
        final AnnotationConfigApplicationContext acx = new AnnotationConfigApplicationContext();
        // register my configuration class
        acx.register(AppConfig.class);
        acx.refresh();

        //get config class in context
        AppConfig bean = acx.getBean(AppConfig.class);  // this obj has a singleton behaviour
        System.out.println(bean);

//        AppConfig bean1 = acx.getBean(AppConfig.class);
//        System.out.println(bean1);

        SpringBean bean1 = acx.getBean(SpringBean.class);
        System.out.println(bean1);

//        acx.close(); // shutdown application context

        //SpringBean2 bean2 = acx.getBean(SpringBean2.class); // Err has been closed already
        //System.out.println(bean2);

//        Runtime runtime = Runtime.getRuntime(); // get jvm / run time
//        runtime.addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() { // run is call to shut down to jvm
//                acx.close();
//                System.out.println("jvm is about to shutdown");
//            }
//        }));

        SpringBean2 bean2 = acx.getBean(SpringBean2.class);
        System.out.println(bean2);

        acx.registerShutdownHook(); // close context after shutdown JVM one moment!

    }
}

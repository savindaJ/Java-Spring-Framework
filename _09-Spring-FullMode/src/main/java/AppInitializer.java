import bean.BeanOne;
import config.FullModeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : savindaJ
 * @date : 2024-02-22
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(FullModeConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        BeanOne bean = ctx.getBean(BeanOne.class);
        System.out.println("bean one reference"+ bean);
        System.out.println(bean.getBasicDataSource());

        BeanOne bean2 = ctx.getBean(BeanOne.class);
        System.out.println("bean two reference"+ bean2);
        System.out.println(bean2.getBasicDataSource());
    }
}

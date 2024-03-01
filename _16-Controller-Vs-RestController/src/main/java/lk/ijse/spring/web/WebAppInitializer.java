package lk.ijse.spring.web;

import lk.ijse.spring.web.api.Controller;
import lk.ijse.spring.web.config.WebAppConfig;
import lk.ijse.spring.web.config.WebRootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public WebAppInitializer() {
        System.out.println("WebAppInitializer Instantiated");
    }


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebAppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebRootConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
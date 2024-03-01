package lk.ijse.spring.web.config;

import lk.ijse.spring.web.api.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author : savindaJ
 * @date : 2024-03-01
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = {"lk.ijse.spring.web.api"})
@EnableWebMvc
public class WebAppConfig implements WebMvcConfigurer { // this is the configuration class for the web application
    public WebAppConfig() {
        System.out.println("WebAppConfig Created");
    }

    @Bean
    public Controller setController(){
        return new Controller();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/WEB-INF/page/**").addResourceLocations("/WEB-INF/page/");
    }

    @Bean
    public ViewResolver render(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/page/"); // this is the location of the jsp files
        resolver.setSuffix(".html"); // this is the extension of the jsp files
        return resolver;
    }
}

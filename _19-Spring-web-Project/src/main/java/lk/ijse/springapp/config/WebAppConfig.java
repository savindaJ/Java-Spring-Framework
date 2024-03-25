package lk.ijse.springapp.config;

import lk.ijse.springapp.util.ObjTransformer;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : savindaJ
 * @date : 2024-03-14
 * @since : 0.1.0
 **/
@Configuration
@EnableWebMvc
@ComponentScan(value = "lk.ijse.springapp.api",basePackageClasses = ObjTransformer.class)
@Import({JpaConfig.class})
public class WebAppConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}

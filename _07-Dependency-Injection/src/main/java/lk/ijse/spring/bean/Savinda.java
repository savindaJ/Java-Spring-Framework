package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.*;

/**
 * @author : savindaJ
 * @date : 2024-02-16
 * @since : 0.1.0
 **/
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME) // homework for you
@Inherited
@Documented
@Qualifier // meta annotation
public @interface Savinda {
    // my meta annotation
}

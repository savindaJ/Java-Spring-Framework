package lk.ijse.springapp.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : savindaJ
 * @date : 2024-03-25
 * @since : 0.1.0
 **/
@Component
public class ObjTransformer {

    @Autowired
    ModelMapper modelMapper;

    public <T> T getEntity(Object dto, Class<T> entity){
        return modelMapper.map(dto, entity);
    }
    public <T> T getDTO(Object entity, Class<T> dto){
        return modelMapper.map(entity, dto);
    }
}

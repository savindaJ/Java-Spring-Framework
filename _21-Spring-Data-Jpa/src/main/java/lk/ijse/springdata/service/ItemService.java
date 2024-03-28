package lk.ijse.springdata.service;

import lk.ijse.springdata.dto.ItemDTO;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
public interface ItemService {
    ItemDTO saveItem(ItemDTO itemDTO);

    boolean updateItem(ItemDTO itemDTO);

    boolean deleteItem(String code);

    List<ItemDTO> getAllItems();
}

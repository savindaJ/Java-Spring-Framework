package lk.ijse.springdata.service.impl;

import lk.ijse.springdata.config.WebAppConfig;
import lk.ijse.springdata.config.WebRootConfig;
import lk.ijse.springdata.dto.ItemDTO;
import lk.ijse.springdata.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@SpringJUnitConfig(classes = {WebRootConfig.class, WebAppConfig.class})
class ItemServiceImplTest {

    ItemService itemService;

    @Autowired
    public ItemServiceImplTest(ItemService itemService) {
        this.itemService = itemService;
    }

    @Test
    void saveItem() {
        itemService.saveItem(new ItemDTO("I001", "Item 1", 100.9, 10));
        assertNotEquals("C001","I001");
    }

    @Test
    void updateItem() {
    }

    @Test
    void deleteItem() {
    }

    @Test
    void getAllItems() {
    }
}
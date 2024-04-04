package lk.ijse.springdata.service.impl;

import lk.ijse.springdata.config.WebRootConfig;
import lk.ijse.springdata.dto.ItemDTO;
import lk.ijse.springdata.service.ItemService;
import lk.ijse.springdata.service.exceptions.NotFoundException;
import lk.ijse.springdata.util.GenerateID;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/

@Transactional // not save the data to the database and rollback the data
@SpringJUnitConfig(classes = {WebRootConfig.class}) // set the configuration class
@WebAppConfiguration
class ItemServiceImplTest {

    ItemService itemService;

    /**
     * @param itemService itemService
     */
    @Autowired
    public ItemServiceImplTest(ItemService itemService) {
        this.itemService = itemService;
    }

    /**
     * Test method for {@link lk.ijse.springdata.service.impl.ItemServiceImpl#saveItem(lk.ijse.springdata.dto.ItemDTO)}.
     */
    @Test
    void saveItem() {
        ItemDTO saveItem = itemService.saveItem(new ItemDTO(GenerateID.generateID(), "Item 1", 100.3, 10));
        assertNotEquals(null, saveItem); // say that the saveItem is not null
    }

    /**
     * Test method for {@link lk.ijse.springdata.service.impl.ItemServiceImpl#updateItem(lk.ijse.springdata.dto.ItemDTO)}.
     */
    @Test
    void updateItem() {
        assertThrows(NotFoundException.class, () -> itemService.updateItem(new ItemDTO("ITM-0d1b", "Item 1", 100.3, 10)));
    }

    /**
     * Test method for {@link lk.ijse.springdata.service.impl.ItemServiceImpl#deleteItem(java.lang.String)}.
     */
    @Test
    void deleteItem() {
        assertThrows(NotFoundException.class, () -> itemService.deleteItem("ITM-0d1b"));
    }

    /**
     * Test method for {@link lk.ijse.springdata.service.impl.ItemServiceImpl#getAllItems()}.
     */
    @Test
    void getAllItems() {
        assertNotEquals("null", itemService.getAllItems());
    }
}
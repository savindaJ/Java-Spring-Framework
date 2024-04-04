package lk.ijse.springdata.repo;

import lk.ijse.springdata.config.WebRootConfig;
import lk.ijse.springdata.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@Transactional
@SpringJUnitConfig(classes = {WebRootConfig.class})
@WebAppConfiguration
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;

    @Test
    void testSaveItem() {
        Item save = itemRepo.save(new Item("ITM001", "Item 1", 100.3, 10));
        assertNotNull(save);
    }

    @Test
    void testUpdateItem() {
        List<Item> itemByName = itemRepo.findItemByName("M");
        System.out.println(itemByName.toString());
    }

    @Test
    void testFindItemByName() {
        Item lastItem = itemRepo.getLastItem();
        System.out.println(lastItem);
    }

    @Test
    void testFindItemByCodeEndingWithOrderByCodeDesc() {
        List<Item> item = itemRepo.findItemByCodeEndingWithOrderByCodeDesc("3");
        System.out.println(item.toString());
    }

    @Test
    void testSearchByCodeAndDescription() {
        Item item = itemRepo.searchByCodeAndDescription("ITM-360948a2", "Raththi");
        System.out.println(item);
    }
}
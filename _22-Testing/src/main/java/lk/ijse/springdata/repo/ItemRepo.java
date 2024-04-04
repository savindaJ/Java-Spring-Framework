package lk.ijse.springdata.repo;

import lk.ijse.springdata.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
public interface ItemRepo extends JpaRepository<Item,String> {
    @Query(value = "SELECT * FROM Item WHERE description LIKE %?1%", nativeQuery = true)
    List<Item> findItemByName(String name);
    @Query(value = "select * from Item order by code desc limit 1", nativeQuery = true)
    Item getLastItem();
    List<Item> findItemByCodeEndingWithOrderByCodeDesc(String code);
    Item searchByCodeAndDescription(String code, String description);
}

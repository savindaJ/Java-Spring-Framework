package lk.ijse.springdata.repo;

import lk.ijse.springdata.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
public interface ItemRepo extends JpaRepository<Item,String> {
}

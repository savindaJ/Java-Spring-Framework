package lk.ijse.springapp.persistence;

import lk.ijse.springapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : savindaJ
 * @date : 2024-03-25
 * @since : 0.1.0
 **/
@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {
}

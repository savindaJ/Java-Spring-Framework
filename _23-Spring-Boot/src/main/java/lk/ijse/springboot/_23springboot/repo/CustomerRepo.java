package lk.ijse.springboot._23springboot.repo;

import lk.ijse.springboot._23springboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {
}

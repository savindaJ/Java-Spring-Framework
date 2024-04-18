package lk.ijse.springsecurity.repo;

import lk.ijse.springsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@Repository
public interface UserRepo extends JpaRepository<User, String> {
    Optional<User> findByUsername(String username); // query method
}

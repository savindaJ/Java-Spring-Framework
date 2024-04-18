package lk.ijse.springsecurity.service;

import lk.ijse.springsecurity.dto.LoginRequest;
import lk.ijse.springsecurity.dto.LoginResponse;
import lk.ijse.springsecurity.dto.SignUpRequestDTO;
import lk.ijse.springsecurity.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
public interface UserService {
    UserDetailsService userDetailsService();
    String saveUser(UserDTO userDTO);
    LoginResponse login(LoginRequest signUpRequestDTO);

}

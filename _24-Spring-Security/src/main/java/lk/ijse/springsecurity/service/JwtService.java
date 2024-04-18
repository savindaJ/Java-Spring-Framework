package lk.ijse.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
public interface JwtService {
    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
    boolean validateToken(String token, UserDetails userDetails);
}

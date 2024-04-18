package lk.ijse.springsecurity.api;

import lk.ijse.springsecurity.dto.LoginRequest;
import lk.ijse.springsecurity.dto.SignUpRequestDTO;
import lk.ijse.springsecurity.dto.UserDTO;
import lk.ijse.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
//        Authentication authenticate = userService.login(loginRequest);
        return "login";
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody UserDTO signUpRequestDTO) {
        String s = userService.saveUser(signUpRequestDTO);
        return ResponseEntity.created(URI.create("/api/auth/login")).body(s);
    }
}

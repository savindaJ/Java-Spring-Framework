package lk.ijse.springsecurity.service.impl;

import lk.ijse.springsecurity.dto.LoginRequest;
import lk.ijse.springsecurity.dto.LoginResponse;
import lk.ijse.springsecurity.dto.SignUpRequestDTO;
import lk.ijse.springsecurity.dto.UserDTO;
import lk.ijse.springsecurity.entity.User;
import lk.ijse.springsecurity.repo.UserRepo;
import lk.ijse.springsecurity.service.JwtService;
import lk.ijse.springsecurity.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    private final ModelMapper mapper;

    private final JwtService jwtService;

    public UserServiceImpl(UserRepo userRepo, ModelMapper mapper, JwtService jwtService) {
        this.userRepo = userRepo;
        this.mapper = mapper;
        this.jwtService = jwtService;
    }

    @Override
    public UserDetailsService userDetailsService() {
        return (username) -> userRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found !"));
    }

    @Override
    public String saveUser(UserDTO userDTO) {
        User save = userRepo.save(mapper.map(userDTO, User.class));
        String s = jwtService.generateToken(save);
        return s;
    }

    @Override
    public LoginResponse login(LoginRequest signUpRequestDTO) {
        return null;
    }
}

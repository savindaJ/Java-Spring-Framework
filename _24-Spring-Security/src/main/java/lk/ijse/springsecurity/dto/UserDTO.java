package lk.ijse.springsecurity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lk.ijse.springsecurity.util.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : savindaJ
 * @date : 2024-04-18
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder // create builder pattern
public class UserDTO {
    private String username;
    private String password;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Role role;
}
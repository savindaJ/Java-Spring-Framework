package lk.ijse.springsecurity.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : savindaJ
 * @date : 2024-04-04
 * @since : 0.1.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}

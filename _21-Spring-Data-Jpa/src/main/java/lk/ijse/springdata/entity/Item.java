package lk.ijse.springdata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Item {
    @Id
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}

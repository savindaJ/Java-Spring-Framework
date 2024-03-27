package lk.ijse.springdata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;
}

package lk.ijse.springdata.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO implements Serializable {
    @NotNull(message = "Code should not be null") // can null only when saving
//    @NotBlank(message = "Code should not be null") // can null only when saving
    private String code;
    @NotBlank(message = "Description should not be null")
    @Pattern(regexp = "^[A-Za-z0-9 ]+$", message = "Description should be a string")
    private String description;
//    @Pattern(regexp = "^[0-9.]+$", message = "Unit Price should be a number")
    private Double unitPrice;
    @DecimalMin(value = "0", message = "Qty on Hand should be a positive number")
    @DecimalMax(value = "1000", message = "Qty on Hand should not exceed 1000")
    private Integer qtyOnHand;
    private String png;
}

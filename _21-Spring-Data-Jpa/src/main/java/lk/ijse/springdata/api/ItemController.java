package lk.ijse.springdata.api;

import jakarta.validation.Valid;
import lk.ijse.springdata.dto.ItemDTO;
import lk.ijse.springdata.service.ItemService;
import lk.ijse.springdata.util.GenerateID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;
import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> saveItem(
            @RequestPart("code") String code,
            @RequestPart("description") String description,
            @RequestPart("unitPrice") Double unitPrice,
            @RequestPart("qtyOnHand") Integer qtyOnHand,
            @RequestPart("png") String image)
    {
        System.out.println("code = " + code);
        System.out.println("description = " + description);
        System.out.println("unitPrice = " + unitPrice);
        System.out.println("qtyOnHand = " + qtyOnHand);
        System.out.println("image = " + image);
        String encode = Base64.getEncoder().encodeToString(image.getBytes());
        ItemDTO itemDTO = new ItemDTO(code, description, unitPrice, qtyOnHand, encode);
        itemDTO.setCode(GenerateID.generateID());
        ItemDTO itemDTO1 = itemService.saveItem(itemDTO);
        return itemDTO1!=null ? ResponseEntity.ok(itemDTO1) : ResponseEntity.ok("Item Not Saved");
    }

    /**
     * @param itemDTO ItemDTO
     * @return ResponseEntity<?>
     */
    @PutMapping
    public ResponseEntity<?> updateItem(@RequestBody @Valid ItemDTO itemDTO) {
        System.out.println("itemDTO = " + itemDTO);
        boolean isUpdated = itemService.updateItem(itemDTO);
        return isUpdated ? ResponseEntity.ok("Item Updated") : ResponseEntity.ok("Item Not Updated");
    }

    @DeleteMapping
    public ResponseEntity<?> deleteItem(@RequestParam("code") String code) {
        boolean isDeleted = itemService.deleteItem(code);
        return isDeleted ? ResponseEntity.ok("Item Deleted") : ResponseEntity.ok("Item Not Deleted");
    }

    @GetMapping
    public List<ItemDTO> getAllItems() {
        return itemService.getAllItems();
    }

    @PostMapping(value = "/upload",consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<?> upload(@RequestParam("png") MultipartFile file){
        System.out.println("file = " + file.getOriginalFilename());
        return ResponseEntity.ok("File Uploaded");
    }
}

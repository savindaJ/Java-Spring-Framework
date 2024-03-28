package lk.ijse.springdata.api;

import lk.ijse.springdata.dto.ItemDTO;
import lk.ijse.springdata.service.ItemService;
import lk.ijse.springdata.util.GenerateID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;

    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public ResponseEntity<?> saveItem(@RequestBody ItemDTO itemDTO) {
        itemDTO.setCode(GenerateID.generateID());
        ItemDTO itemDTO1 = itemService.saveItem(itemDTO);
        return itemDTO1!=null ? ResponseEntity.ok(itemDTO1) : ResponseEntity.ok("Item Not Saved");
    }

    @PutMapping
    public ResponseEntity<?> updateItem(@RequestBody ItemDTO itemDTO) {
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
}

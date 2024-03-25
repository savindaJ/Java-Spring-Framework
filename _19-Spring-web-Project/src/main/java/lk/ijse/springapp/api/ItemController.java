package lk.ijse.springapp.api;

import org.springframework.web.bind.annotation.*;

/**
 * @author : savindaJ
 * @date : 2024-03-25
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/item")
public class ItemController {

    @PostMapping
    public void saveItem(){
        System.out.println("Item is saved");
    }

    @GetMapping
    public void getAllItems(){
        System.out.println("All items are fetched");
    }

    @PutMapping
    public void updateItem(){
        System.out.println("Item is updated");
    }

    @DeleteMapping
    public void deleteItem(){
        System.out.println("Item is deleted");
    }
}

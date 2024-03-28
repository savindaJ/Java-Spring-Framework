package lk.ijse.springdata.service.impl;

import lk.ijse.springdata.dto.ItemDTO;
import lk.ijse.springdata.entity.Item;
import lk.ijse.springdata.repo.ItemRepo;
import lk.ijse.springdata.service.ItemService;
import lk.ijse.springdata.service.exceptions.DuplicateRecordException;
import lk.ijse.springdata.service.exceptions.NotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : savindaJ
 * @date : 2024-03-27
 * @since : 0.1.0
 **/
@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepo itemRepo;
    private final ModelMapper modelMapper;

    public ItemServiceImpl(ItemRepo itemRepo, ModelMapper modelMapper) {
        this.itemRepo = itemRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public ItemDTO saveItem(ItemDTO itemDTO) {
        if (itemRepo.existsById(itemDTO.getCode())) {
            throw new DuplicateRecordException("Item already exists");
        }
        Item save = itemRepo.save(modelMapper.map(itemDTO, Item.class));
        return modelMapper.map(save, ItemDTO.class);
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) {
        if (!itemRepo.existsById(itemDTO.getCode())) {
            throw new NotFoundException("Item not found");
        }
        Item save = itemRepo.save(modelMapper.map(itemDTO, Item.class));
        return save != null;
    }

    @Override
    public boolean deleteItem(String code) {
        boolean existsById = itemRepo.existsById(code);
        if (!existsById) {
            throw new NotFoundException("Item not found");
        }
        itemRepo.deleteById(code);
        return true;
    }

    @Override
    public List<ItemDTO> getAllItems() {
//        Stream<Item> itemStream = itemRepo.findAll().stream().sorted();
//        System.out.println("itemStream = " + itemStream.map(item -> modelMapper.map(item, ItemDTO.class)).toList());
        return itemRepo.findAll().stream().map(item -> modelMapper.map(item, ItemDTO.class)).toList();
    }
}

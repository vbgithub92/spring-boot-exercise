package vb.springbootexercise.inventory.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vb.springbootexercise.inventory.dao.ItemRepository;
import vb.springbootexercise.inventory.model.Item;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepo;

    public List<Item> getAllItems(){
        List<Item> inventory = new ArrayList<>();
        itemRepo.findAll().forEach(inventory::add);
        inventory.toString();
        return inventory;
    }

    public Item getItem(Long no){
        return itemRepo.findOne(no);
    }

    public String addItem(Item item){
            itemRepo.save(item);
            return "Item was successfully added to the inventory!\n" + item.toString();
    }

    // works for increasing or decreasing the amount in the stock
    public String updateInventory(Long no, int updateAmount){
        getItem(no).updateAmount(updateAmount);
        itemRepo.save(getItem(no));
        return "Item stock was successfully updated!\n" + "Items updated info: " + getItem(no).toString();
    }

    public void deleteItem(Long no){
        itemRepo.delete(no);
    }
}

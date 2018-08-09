package vb.springbootexercise.inventory.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vb.springbootexercise.inventory.model.Item;
import vb.springbootexercise.inventory.services.ItemService;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;


    @ApiOperation("Returns all items in the inventory")
    @RequestMapping(method = RequestMethod.GET, value = "/inventory")
    public List<Item> getInventory(){
        return itemService.getAllItems();
    }

    @ApiOperation("Returns a specific item given the items 'no'")
    @RequestMapping(method = RequestMethod.GET, value = "/inventory/{no}")
    public Item getItem(@PathVariable Long no){
        return itemService.getItem(no);
    }

    @ApiOperation("Adds a new item to the inventory")
    @RequestMapping(method = RequestMethod.POST, value = "/inventory")
    public String addItem(@RequestBody Item item){
       return itemService.addItem(item);
    }

    @ApiOperation("Updates a specific items amount, works for increasing as well as decreasing")
    @RequestMapping(method = RequestMethod.PUT, value = "/inventory/{no}/{amountUpdate}")
    public String updateAmount(@RequestBody Item item, @PathVariable Long no, @PathVariable int amountUpdate){
       return itemService.updateInventory(no, amountUpdate);
    }

    @ApiOperation("Deletes an item from the inventory given the items 'no'")
    @RequestMapping(method = RequestMethod.DELETE, value = "/inventory/{no}")
    public void deleteItem(@RequestBody Item item, @PathVariable Long no){
        itemService.deleteItem(no);
    }

}

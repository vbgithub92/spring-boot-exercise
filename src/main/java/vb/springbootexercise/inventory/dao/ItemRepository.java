package vb.springbootexercise.inventory.dao;

import org.springframework.data.repository.CrudRepository;
import vb.springbootexercise.inventory.model.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}

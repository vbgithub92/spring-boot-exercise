package vb.springbootexercise.inventory.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

    @ApiModelProperty(notes = "Items ID number in the inventory")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long no;
    @ApiModelProperty(notes = "Items name")
    private String name;
    @ApiModelProperty(notes = "Items quantity in the inventory")
    private int amount;
    @ApiModelProperty(notes = "Inventory code for company usage")
    private String inventoryCode;

    public Item() {
    }

    public Item(String name, int amount, String inventoryCode) {

        this.name = name;
        this.amount = amount;
        this.inventoryCode = inventoryCode;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public void updateAmount(int updateAmount) {
        this.amount += updateAmount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", inventoryCode='" + inventoryCode + '\'' +
                '}';
    }
}

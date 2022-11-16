/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.dto;

import java.math.BigDecimal;

/**
 *
 * @author 15874
 */
public class Item {

    public Item(String itemId, String itemName, BigDecimal itemPrice) {
        
    }
    
    BigDecimal colaPrice = new BigDecimal("1.75");
    BigDecimal spritePrice = new BigDecimal("1.73");
    BigDecimal waterPrice = new BigDecimal("1.06");
    
    public Item cola = new Item("1", "Cola", colaPrice);
    public Item sprite = new Item("2", "Sprite", spritePrice);
    public Item water = new Item("3", "Water", waterPrice);
}

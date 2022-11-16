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
public enum Changes {
    QUARTER("quarter", "0.5"), DIME("dime", "0.1"), NICKEL("nickel", "0.05"), PENNY("penny", "0.01");
    private String name;
    private String value;
    
    private Changes(String name, String value){
        this.name = name;
        this.value = value;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public BigDecimal getValue(){
        return new BigDecimal(value);
    }
    
    public void setValue(String value){
        this.value = value;
    }
}

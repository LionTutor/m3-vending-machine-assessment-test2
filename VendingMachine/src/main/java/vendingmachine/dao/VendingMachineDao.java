/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.dao;

import java.math.BigDecimal;
import vendingmachine.dto.Change;

/**
 *
 * @author 15874
 */
public interface VendingMachineDao {
    
    public BigDecimal calculateForCola(Change changes, BigDecimal quarter, BigDecimal dime, BigDecimal nickel, BigDecimal penny, BigDecimal colaPrice);
    public BigDecimal calculateForSprite(Change changes, BigDecimal quarter, BigDecimal dime, BigDecimal nickel, BigDecimal penny, BigDecimal spritePrice);
    public BigDecimal calculateForWater(Change changes, BigDecimal quarter, BigDecimal dime, BigDecimal nickel, BigDecimal penny, BigDecimal waterPrice);

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.dao;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import vendingmachine.dto.Change;

/**
 *
 * @author 15874
 */
public class VendingMachineDaoImpl implements VendingMachineDao{

    @Override
    public BigDecimal calculateForCola(Change changes, BigDecimal quarter, BigDecimal dime, BigDecimal nickel, BigDecimal penny, BigDecimal colaPrice) {
        Scanner sc = new Scanner(System.in);
        BigDecimal userInput = sc.nextBigDecimal();
        quarter = new BigDecimal("0.25");
        dime = new BigDecimal("0.10");
        nickel = new BigDecimal("0.05");
        penny = new BigDecimal("0.01");
        colaPrice = new BigDecimal("1.75");
        
        
            switch (changes){
                case QUARTER:
                    return (userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN);
                case DIME:
                    return (userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter))).divide(dime, RoundingMode.DOWN);
                case NICKEL:
                    return (userInput.subtract(colaPrice).subtract(userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter))).subtract((userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter))).divide(dime, RoundingMode.DOWN).multiply(dime))).divide(nickel, RoundingMode.DOWN);
                case PENNY:
                    return (userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter)).subtract((userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter))).divide(dime, RoundingMode.DOWN).multiply(dime)).subtract((userInput.subtract(colaPrice).subtract(userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter))).subtract((userInput.subtract(colaPrice).subtract((userInput.subtract(colaPrice)).divide(quarter, RoundingMode.DOWN).multiply(quarter))).divide(dime, RoundingMode.DOWN).multiply(dime))).divide(nickel, RoundingMode.DOWN).multiply(nickel))).divide(penny, RoundingMode.DOWN);
                default:
                    throw new UnsupportedOperationException("Not supported yet."); 
            }
        }
    

    @Override
    public BigDecimal calculateForSprite(Change changes, BigDecimal quarter, BigDecimal dime, BigDecimal nickel, BigDecimal penny, BigDecimal spritePrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal calculateForWater(Change changes, BigDecimal quarter, BigDecimal dime, BigDecimal nickel, BigDecimal penny, BigDecimal waterPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

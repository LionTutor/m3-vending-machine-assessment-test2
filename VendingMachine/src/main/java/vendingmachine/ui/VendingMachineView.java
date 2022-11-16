/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.ui;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author 15874
 */
public class VendingMachineView {
    
    private UserIO io = new UserIOConsoleImpl();
    
    public void printMenu(){
        io.print("All items and their prices are listed below:");
        io.print("1. Cola - 1.75 Dollars");
        io.print("2. Sprite - 1.73 Dollars");
        io.print("3. Water - 1.06 Dollar");
        io.print("4. Exit");
        io.print("");
        io.print("Please put in some amount of money to start selecting from the above choices.");
        
        
    }
    
    public int showMenuAndGetSelection(){
        
        String userInput = "";
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();
        System.out.println("You inserted " + userInput);
        return io.readInt("Please start selecting from the above choices.", 1, 4);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmashine.contrllor;

import vendingmachine.dao.VendingMachineDao;
import vendingmachine.dao.VendingMachineDaoImpl;
import vendingmachine.ui.UserIO;
import vendingmachine.ui.UserIOConsoleImpl;
import vendingmachine.ui.VendingMachineView;

/**
 *
 * @author 15874
 */
public class VendingMachineController {
    
    
    private VendingMachineView view = new VendingMachineView();
    private VendingMachineDao dao = new VendingMachineDaoImpl();
    private UserIO io = new UserIOConsoleImpl();
    
    
    public void run(){
        boolean keeping = true;
        int menuSelection = 0;
        while (keeping){
            
            viewMenuSelection();
            
            menuSelection = getMenuSelection();
            
            switch (menuSelection){
                case 1:
                    io.print("Cola selected");
                    break;
                case 2:
                    io.print("Sprite selected");
                    break;
                case 3:
                    io.print("Water selected");
                    break;
                case 4:
                    keeping = false;
                    break;
                default:
                    io.print("UNKNOWN COMMAND");
            }
        }
        io.print("GOOD BYE!");
    }
    private void viewMenuSelection(){
        view.printMenu();
    }
    
    private int getMenuSelection(){
        return view.showMenuAndGetSelection();
    }
    
    private void colaSelected(){
        
    }
}

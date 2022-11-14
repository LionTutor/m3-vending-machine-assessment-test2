/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Product;
import java.util.List;

/**
 *
 * @author lionwife
 */
public interface VendingMachineDao {
   //Show all products
    List<Product> getAllProducts()throws VendingMachineDaoException;
    Product getProduct(String id)throws VendingMachineDaoException;;
   //If (usermoney >= item.price) item,quqnaty - 1
    void dispenseProduct(Product product)throws VendingMachineDaoException;
}

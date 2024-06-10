/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.DBInsert;

/**
 *
 * @author irosh
 */
public class Insertcontroller {
    
    public static void insertForm(String bkID,String bkName,String bkAuthor,String cate){
    
    if(bkID != null){
        
        new DBInsert().insert(bkID, bkName, bkAuthor, cate);
        
        JOptionPane.showMessageDialog(null,"Add succesfull","succesfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
    public static void insertUser(String usId,String name,String cnNumber,String adderess,String password){
    
    if(usId != null){
        
        new DBInsert().insertUser(usId, name, cnNumber, adderess, password);
        
        JOptionPane.showMessageDialog(null,"Add succesfull","succesfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
    
    
    
}

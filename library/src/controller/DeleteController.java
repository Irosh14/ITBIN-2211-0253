/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBSearch;
import model.DBDelete;

/**
 *
 * @author irosh
 */
public class DeleteController {
    
    public static void deletebook(String bookId){
        
        try {
             String bkId = null;
             
             ResultSet rs = new DBSearch().searchBook(bookId);
             
             while(rs.next()) {
                 bkId = rs.getNString("id");
                 
                 if(bkId != null){
                     
                     new DBDelete().deleteBook(bookId);
                     JOptionPane.showMessageDialog(null,"Record Deleted","Successfull",JOptionPane.INFORMATION_MESSAGE);
                 }
             }
             DBConnection.closecon();
            
                
            
            
            
        } catch (Exception e) {
        }
    }
    
    
    
}

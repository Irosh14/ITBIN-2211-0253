/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irosh
 */
public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    
    
    public ResultSet searchLoggin(String usName){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            String name = usName;
            
            rs = stmt.executeQuery("SELECT * FROM login WHERE usname = '"+name+"'");
        } catch (Exception e) {
            
            //Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
    
    
     }
    public ResultSet searchallbook(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM book");
        } catch (Exception e) {
        }
    return rs;
    
    }
    public ResultSet searchBook(String  bookId){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
             stmt = DBConnection.getStatementConnection();
             
             rs = stmt.executeQuery("SELECT * FROM book WHERE id = '"+bookId+"'");
             
             
          
        } catch (Exception e) {
        }
        return rs;
    }
     public ResultSet searchuser(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM register");
        } catch (Exception e) {
        }
    return rs;
    
    }
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author irosh
 */
public class DBDelete {
    
    Statement stmt;
    
    public void deleteBook(String bookId){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM book WHERE id = '"+bookId+"' ");
            
            
            
        } catch (Exception e) {
        }
    }
    
}

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
public class DBInsert {
    
    Statement stmt;
    
    public void insert(String bkID,String bkName,String bkAuthor,String cate){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            String bookID = bkID;
            String bookName = bkName;
            String Author = bkAuthor;
            String category = cate;
            
            stmt.executeUpdate("INSERT INTO book VALUES('"+bookID+"','"+bookName+"','"+Author+"','"+category+"')");
            
            
            
        } catch (Exception e) {
        }
    
    
    
    }
    public void insertUser(String usId,String name,String cnNumber,String adderess,String password){
        try {
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
           
            
            
            
            stmt.executeUpdate("INSERT INTO register VALUES('"+usId+"','"+name+"','"+cnNumber+"','"+adderess+"','"+password+"')");
            
            
            
            
            
        } catch (Exception e) {
        }
    }
    
}

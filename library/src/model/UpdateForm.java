/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.DBConnection;

import java.sql.Statement;

/**
 *
 * @author irosh
 */
public class UpdateForm {
    
    Statement stmt;
    
    public void updateForm(String bkID,String bkName,String bkAuthor,String cate){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            
            stmt.executeUpdate("UPDATE `book` SET `bname` = '"+bkName+"',`author`='"+bkAuthor+"',`catagory`='"+cate+"' WHERE id='"+bkID+"' ");
        } catch (Exception e) {
        }
    
    
    }
    
}
 
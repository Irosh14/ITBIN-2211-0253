/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author irosh
 */
public class DBConnection {
    
    static Connection conn;
    static Statement stat = null;
   
    public static Statement getStatementConnection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/library","root","");
            
            stat = conn.createStatement();
            
        } catch (Exception e) {
        }
    
    
    return stat;
    
    }
    
    public static void closecon() throws SQLException{
        conn.close();
    }
    
}

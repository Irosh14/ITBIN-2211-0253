/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import model.DBSearch;
import view.homeview;
import view.loginview;
import model.DBConnection;
/**
 *
 * @author irosh
 */
public class Logincontroller {
    
    public static void login(String usname,String pW){
        
        try {
            
            String username = null;
            String password = null;
            
            ResultSet rs = new DBSearch().searchLoggin(usname);
            
            while (rs.next()){
            
                username = rs.getString("usname");
                password = rs.getString("password");
            }
            if(username !=null && password !=null){
            
            if(username.equals(usname) && password.equals(pW)){
            
            System.out.println("Login Succesfull");
            
            loginview.getFrames()[0].dispose();
            
            new homeview().setVisible(true);
           
            }
            
            }
        } catch (Exception e) {
        }
        
        
    }
    
}

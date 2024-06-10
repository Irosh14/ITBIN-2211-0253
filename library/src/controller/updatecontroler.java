/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import javax.swing.JOptionPane;
import model.UpdateForm;

/**
 *
 * @author irosh
 */
public class updatecontroler {
    
    public static void UpdateForm(String bkID,String bkName,String bkAuthor,String cate){
    
    new UpdateForm().updateForm(bkID, bkName, bkAuthor, cate);
    
    if(bkID.equals("")){
    
    
    }
    else{
        JOptionPane.showMessageDialog(null, "Update Successfully!","successfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    }
    
}

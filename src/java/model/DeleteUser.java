/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.Dbconnector;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tv464
 */
public class DeleteUser {
     public boolean delete(String username){
         Statement st = Dbconnector.getStatement();
       try{
           String query5="DELETE FROM swingdatabase WHERE username ='"+username+" '";
           
           System.out.println(query5);
        int i= st.executeUpdate(query5);
        if(i>0){
            
            return true;
        }else{
            return false;
        }
        
       // con.close();
       }
       catch(SQLException e){
           System.out.println(e);
       }  
    return false;
            }
}

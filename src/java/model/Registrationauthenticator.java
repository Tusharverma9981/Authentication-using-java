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
public class Registrationauthenticator {
    public boolean register(String id,String username,String password,String city,String salary){
         Statement st = Dbconnector.getStatement();
       try{
           String query2="INSERT INTO swingdatabase values('"+id+"','"+username+"','"+password+"','"+city+"','"+salary+"')";
           System.out.println(query2);
        int i= st.executeUpdate(query2);
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

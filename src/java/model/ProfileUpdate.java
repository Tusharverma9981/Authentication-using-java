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
public class ProfileUpdate {
     public boolean Update(String id,String username,String password,String city,String salary){
         Statement st = Dbconnector.getStatement();
       try{
          // String query4="INSERT INTO swingdatabase values('"+id+"','"+username+"','"+password+"','"+city+"','"+salary+"')";
           //UPDATE users SET email='newemail@example.com', password='newsecurepassword' WHERE username='john_doe';

            String query4="UPDATE swingdatabase SET username='"+username+"',password='"+password+"',id='"+id+"',city='"+city+"',salary='"+salary+"'WHERE username='"+username+"' ";
           
           System.out.println(query4);
        int i= st.executeUpdate(query4);
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

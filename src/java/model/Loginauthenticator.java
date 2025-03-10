/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import db.Dbconnector;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author tv464
 */
public class Loginauthenticator {
    public boolean isLogin(UserDTO user) throws SQLException{
         String username = user.getUsername();
        String password = user.getPassword();
        String tablepassword = "";
        //String tableusername = "";
        Statement st = Dbconnector.getStatement();
        try{
            String query = "SELECT password FROM swingdatabase WHERE username='"+username+"'";
             System.out.println(query);
             
             ResultSet rs=st.executeQuery(query);
             if(rs.next()){
                
                 tablepassword = rs.getString(1);
            }
        }
         catch(SQLException e){
            System.out.println(e);
        }
        if(username!=null && password!=null && !username.trim().equals("") && password.equals(tablepassword)){
       return true;
        }
    return false;
    }
}

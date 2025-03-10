/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.Dbconnector;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DeleteUser;
import model.Registrationauthenticator;
import dto.UserDTO;


/**
 *
 * @author tv464
 */
public class deleteProflie extends HttpServlet {
 @Override
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
         
    }
 @Override
   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
      //  String username = "";
        //String username = (String)session.getAttribute("username");
        String username = (String) request.getSession().getAttribute("username");

//String username = user.getusername();
        //Registrationauthenticator authenticator = new   Registrationauthenticator();
        DeleteUser deleteuser = new DeleteUser();
        boolean delete = deleteuser.delete(username);
         
       if(delete){
           
           response.sendRedirect("login.html");
       }else{
           response.sendRedirect("profile.jsp");
       } 
    }
}

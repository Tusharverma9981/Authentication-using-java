/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Registrationauthenticator;

public class RegistrationChecker extends HttpServlet {
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("registration.html");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String id = request.getParameter("id");
       String password = request.getParameter("password");
       String username = request.getParameter("username");
       String city = request.getParameter("city");
       String salary = request.getParameter("salary");
       
        Registrationauthenticator authenticator = new   Registrationauthenticator();
        boolean login = authenticator.register(id,username, password,city,salary);
         
       if(login){
             HttpSession  session = request.getSession(true);
             session.setAttribute("username", username);
          
           response.sendRedirect("login.html");
       }else{
           response.sendRedirect("registration.html");
       }
         
    }
}

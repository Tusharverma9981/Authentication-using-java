package controller;

import dto.UserDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Loginauthenticator;

/**
 *
 * @author Pankaj
 */
public class Loginchecker extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        response.sendRedirect("login.html");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            UserDTO user = new UserDTO();
            user.setUsername(username);
            user.setPassword(password);
            
            Loginauthenticator l1 = new Loginauthenticator();
            boolean login = l1.isLogin(user);
            
            if(login)
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("username", username);
                response.sendRedirect("home.jsp");
            }
            else
            {
                response.sendRedirect("loginFail.html");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Loginchecker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

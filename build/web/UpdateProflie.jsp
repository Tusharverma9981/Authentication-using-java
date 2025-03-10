<%-- 
    Document   : UpdateProflie
    Created on : 4 Mar, 2025, 12:02:49 PM
    Author     : tv464
--%>

<%@page import="db.Dbconnector"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
  .update-profile {
    width: 300px;
    margin: 20px auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 12px;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    background-color: #f9f9f9;
  }
  .update-profile h3 {
    text-align: center;
    margin-bottom: 15px;
    color: #333;
  }
  .update-profile label {
    display: block;
    margin-bottom: 5px;
    color: #555;
  }
  .update-profile input {
    width: 100%;
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 8px;
  }
  .update-profile button {
    width: 100%;
    padding: 10px;
    background-color: #4CAF50;
    color: white;
    border: none;
    border-radius: 8px;
    cursor: pointer;
    font-size: 16px;
  }
  .update-profile button:hover {
    background-color: #45a049;
  }
</style>

 
        <% 
        String username =(String)session.getAttribute("username");
         Statement st = Dbconnector.getStatement();
         String query = "SELECT  * FROM swingdatabase WHERE username='"+username+"'";
        
          ResultSet rs=st.executeQuery(query);
          
          String id ="";
          String salary ="";
          String city ="";
          String password = "";
          
          
           if(rs.next()){
               
                  id = rs.getString(1);
                  password = rs.getString(3);
                  city = rs.getString(4);
                   salary = rs.getString(5);
                    
                    
            }
           
//          
//               
        
%>

    <body>
        
        <form class="update-profile" method="POST" action="UpdateProfile">
  <h3>Update Profile</h3>
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" value="<%= username %>" placeholder="Enter new username" readonly>

  <label for="user-id">ID:</label>
  <input type="text" id="user-id" name="id" value="<%= id %>" placeholder="Enter new ID" required>

  <label for="salary">Salary:</label>
  <input type="text" id="salary" name="salary" value="<%= salary %>" placeholder="Enter new salary" >

  <label for="city">City:</label>
  <input type="text" id="city" name="city" value="<%= city %>" placeholder="Enter new city" >

   <label for="passwordOld">Old Password:</label>
   <input type="text" id="password" name="Oldpassword" value="<%= password %>">
  
  <label for="password">Password:</label>
  <input type="password" id="password" name="password" placeholder="Enter new password" value="<%= password %>">

  <button type="submit">Update</button>
</form>
        
    </body>
</html>

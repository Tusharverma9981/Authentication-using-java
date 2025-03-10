<%-- 
    Document   : profile
    Created on : 3 Mar, 2025, 8:06:02 PM
    Author     : tv464
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="db.Dbconnector"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
  .user-profile {
    width: 300px;
    margin: 20px auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 12px;
    box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
    background-color: #f9f9f9;
  }
  .user-profile h2 {
    text-align: center;
    margin-bottom: 15px;
    color: #333;
  }
  .user-profile ul {
    list-style: none;
    padding: 0;
  }
  .user-profile li {
    margin-bottom: 10px;
  }
  .user-profile strong {
    color: #555;
  }
</style>
    </head>
    <body>
        <% 
        String username =(String)session.getAttribute("username");
         Statement st = Dbconnector.getStatement();
         String query = "SELECT  * FROM swingdatabase WHERE username='"+username+"'";
        
          ResultSet rs=st.executeQuery(query);
          
          String id ="";
          String salary ="";
          String city ="";
          
          
           if(rs.next()){
               
                  id = rs.getString(1);
                  city = rs.getString(4);
                   salary = rs.getString(5);
                    
            }
           
//          
//               
        %>
   
       <div class="user-profile">
  <h2>User Profile</h2>
  <ul>
        <li><strong>ID:</strong> <span id="user-id" ><%=id %></span></li>
       <li><strong>Username</strong> <span id="username"><%= username %></span></li>
  
        
      
    <li><strong>Salary:</strong> <span id="salary"><%= salary %></span></li>
    <li><strong>City:</strong> <span id="city"><%= city %></span></li>
  </ul>
  <form method="GET" action="UpdateProfile">
              <button id="profile-button">
              Update Proflie
          </button>
      </form>
       <br>
  <form method="POST" action="deleteProflie" >
      <button id="profile-button" onclick="alert='do you want to delete the user' ">
              Delete Proflie
          </button>
      </form>
       <br>
       <form method="get" action="home.jsp" >
      <button id="profile-button" onclick=alertmessage>
              Home
          </button>
      </form>
</div>
  
  <script>
      alertmessage = ()=>{
          alert("are you sure you want to delete the user");
      }
  </script>
  
    </body>
</html>

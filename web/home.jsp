<%-- 
    Document   : home
    Created on : 13 Feb, 2025, 5:14:10 PM
    Author     : tv464
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
   
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
   
        <style>
/*            #profile-button{
                margin-top: 10px;
                margin-right: 5px;
                padding:0px;
            }*/
.fixed-top{
    height: 60px;
}
        </style>
    </head>
    <body>
<!--        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Welcome</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      
      <li> <form method="GET" action="ProfileChecker">
              <button id="profile-button">
              Proflie
          </button>
      </form></li>
      
      
    
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="logout.jsp"><span class="glyphicon glyphicon-user"></span>Login</a></li>
      <li><a href="login.html"><span class="glyphicon glyphicon-log-in"></span> Sign-out </a></li>
    </ul>
  </div>
</nav-->

        <nav class="navbar navbar-expand-lg fixed-top " style="background-color: #e3f2fd;">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Home</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <form method="GET" action="ProfileChecker">
              <button id="profile-button" class="btn">
              Proflie
          </button>
      </form>
        </li>
        <li class="nav-item">
            <a class="nav-link "  href="about.html">About</a>
        </li>
        <li class="nav-item">
            
          <a class="nav-link" href="logout.jsp">Log-out</a>
        </li>
        
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

        <% 
        String username =(String)session.getAttribute("username");
        if(username==null || username.trim().equals("")){
            response.sendRedirect("login.html");
        }
        %>
         <h2></h2>
        <h1>Hello <%= username%></h1>
        <div class="row row-cols-lg-3 row-cols-md-2 row-cols-sm-1 mt-3">
   <% for(int i=0;i<15;i++){ %> 
      <a href="" class="listing-link"> 
   <div class="card col" >
      <img src="https://media.istockphoto.com/id/1403500817/photo/the-craggies-in-the-blue-ridge-mountains.jpg?s=612x612&w=0&k=20&c=N-pGA8OClRVDzRfj_9AqANnOaDS3devZWwrQNwZuDSk=" class="card-img-top" alt="image" style="height: 20rem;">
      <div class="card-img-overlay"></div>
      <div class="card-body">
        <p class="card-text">
        <b> </b>title<br/>
         
        </p>
      </div>
    </div>
   </a> 
    <% } %>
   </div>
    </body>
</html>

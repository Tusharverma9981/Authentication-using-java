# User Authentication System using Java (Servlets and JSP)

## Project Overview
This project is a simple user authentication system built using Java Servlets and JSP (JavaServer Pages). It provides basic functionality for user registration, login, and session management. The goal is to create a secure and efficient authentication flow for a web application.

## Features
- User Registration
- User Login
- Password Encryption
- Session Management
- Logout Functionality

## Technologies Used
- Java (JDK 11+)
- Servlets
- JSP (JavaServer Pages)
- Apache Tomcat (or any other compatible servlet container)
- MySQL (or any other relational database)
- JDBC for database connectivity
- HTML/CSS for front-end design

## Project Structure
```
project-root
|-- src
|   |-- controllers
|   |   |-- LoginServlet.java
|   |   |-- RegisterServlet.java
|   |   |-- LogoutServlet.java
|   |-- models
|   |   |-- User.java
|   |-- dao
|   |   |-- UserDAO.java
|-- web
|   |-- index.jsp
|   |-- login.jsp
|   |-- register.jsp
|   |-- home.jsp
|   |-- error.jsp
|-- web.xml
```



## Usage
- Navigate to the registration page and create a new user account.
- Login with the registered credentials.
- Upon successful login, the user will be redirected to the home page.
- Use the logout button to end the session.

## Future Enhancements
- Input validation and better error handling
- Implementing password hashing
- Adding role-based access control
- Enhancing the UI with CSS frameworks

## License
This project is licensed under the MIT License.


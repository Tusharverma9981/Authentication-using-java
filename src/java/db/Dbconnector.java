//90% of storage used … If you run out, you can't create, edit, and upload files. Get 30 GB of storage for ₹59.00 ₹15.00 for 1 month.
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Pankaj
 */
public class Dbconnector 
{
    static Connection con = null;
    static Statement st = null;
    
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db33","root","root");
            System.out.println("Connected");
            
            st = con.createStatement();            
        }
        catch(ClassNotFoundException e)
        {
            System.out.println(e);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
    public static Statement getStatement()
    {
        return st;
    }
}
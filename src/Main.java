import java.sql.*;


//import java.sql.DriverManager;
//import java.util.Calendar;

/**
 * A Java MySQL PreparedStatement INSERT example.
 * Demonstrates the use of a SQL INSERT statement against a
 * MySQL database, called from a Java program, using a
 * Java PreparedStatement.
 *
 * Created by Alvin Alexander, http://alvinalexander.com
 */
public class Main
{

    public static void main(String[] args)
    {
        try
        {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver"; //org.gjt.mm.mysql.Driver //com.mysql.jdbc.Driver
            String myUrl = "jdbc:mysql://localhost:3306/phpmyadmin";  // jdbc:mysql://localhost:3306/casottoDB
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "phpmyadmin", "Hka7+ha6!");
            conn.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}

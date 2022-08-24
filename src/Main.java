import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List<Guest> users = new ArrayList<>();
        try
        {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/cicero";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "root", "passwordina");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM guest");
            while(rs.next()){
                Guest guest = new Guest(rs.getInt("guest_id"),rs.getString("email"), rs.getString("password"), rs.getString("name"), rs.getString("surname"));
                users.add(guest);
            }
            conn.close();
            System.out.println("Effettua il login per viaggiare!");
            System.out.println("Inserisci la tua mail");
            String username = scan.nextLine();
            System.out.println("Inserisci la password");
            String password = scan.nextLine();
            Guest generic_guest = new Guest(0,"","","","");
            generic_guest.login(username, password, users);
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            //System.err.println(e.getMessage());
            System.out.println(e);
        }
    }
}

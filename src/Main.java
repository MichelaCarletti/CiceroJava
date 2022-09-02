import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        List<Tourist> users = new ArrayList<>();
        List<Tour> tours = new ArrayList<>();
        try
        {
            // create a mysql database connection
            String myDriver = "com.mysql.cj.jdbc.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/cicero";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(myUrl, "root", "passwordina");
            Statement statement = conn.createStatement();
            //Caricamento utenti
            ResultSet rs = statement.executeQuery("SELECT * FROM user JOIN tourist");
            while(rs.next()){
                Tourist guest = new Tourist(rs.getInt("tourist_id"),rs.getString("email"), rs.getString("password"), rs.getString("name"), rs.getString("surname"), "", "");
                users.add(guest);
            }
            //Caricamento tours
            rs = statement.executeQuery("SELECT * FROM tour");
            while(rs.next()){
                List<TourCosts> costs_list = new ArrayList<>();
                List<Day> days_list = new ArrayList<>();
                List<Tourist> tourists = new ArrayList<>();
                if(!rs.getString("tourists").equals("")){
                    String string_tourists = rs.getString("tourists");
                    String[] array_tourists = string_tourists.split("|");
                    for(Tourist tourist : users){
                        tourists.add(tourist);
                    }
                }
                Tour tour = new Tour(rs.getInt("tour_id"),rs.getString("title"),rs.getString("description"),rs.getInt("max_tourists_number"),rs.getInt("min_tourists_number"),rs.getInt("max_guest_reservation_days"),rs.getString("status"),costs_list,days_list,rs.getInt("guide_id"),rs.getString("tipology"),rs.getInt("duration"), tourists);
                tours.add(tour);
            }
            conn.close();
            System.out.println("Effettua il login per viaggiare!");
            System.out.println("Inserisci la tua mail");
            String username = scan.nextLine();
            System.out.println("Inserisci la password");
            String password = scan.nextLine();
            User current_user = new User(0,"","","","");
            if(current_user.login(username, password, users)){
                for(Tourist tourist : users){
                    if(tourist.getEmail().equals(username)){
                        Tourist current_tourist = new Tourist(tourist.getId(), "","","","","","");
                        current_tourist.setEmail(tourist.getEmail());
                        current_tourist.setName(tourist.getName());
                        current_tourist.setPassword(tourist.getPassword());
                        current_user.setSurname(tourist.getSurname());
                        System.out.println("--------------------------");
                        System.out.println("Scegli una delle opzioni:");
                        System.out.println("1) Prenota tour");
                        System.out.println("2) Invita un amico");
                        System.out.println("3) Suggerisci tour");
                        System.out.println("4) Prenota corso di formazione");
                        System.out.println("5) Recensisci un tour");
                        System.out.println("6) Recensisci una guida");
                        int choice = 0;
                        choice = scan.nextInt();
                        switch(choice){
                            case 1:
                                System.out.println("Scegli il tour da prenotare!");
                                for(Tour tour : tours){
                                    System.out.println(tour.getId() + ") " + tour.getTitle());
                                }
                                choice = scan.nextInt();
                                if(current_tourist.book_tour(choice, tours)){
                                    System.out.println("Prenotazione effettuata");
                                }
                                else{
                                    System.out.println("Prenotazione non effettuata");
                                }
                                break;
                            case 2:
                                String guest_email = scan.nextLine();
                                current_tourist.invite_guest(guest_email, users);
                                break;

                            case 3:
                                current_tourist.suggest_tour();
                                break;
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.err.println("Got an exception!");
            System.out.println(e);
        }
    }
}

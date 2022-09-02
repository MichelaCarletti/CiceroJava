import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Tourist extends User {

    private String category;
    private String birth_date;

    public Tourist(int user_id, String email, String password, String name, String surname, String category, String birth_date){
        super(user_id, email, password, name, surname);
        this.category = category;
        this.birth_date = birth_date;
    }

    public boolean book_tour(int tour_id, List<Tour> tours) {
        for (Tour tour : tours) {
            if ((tour.getId() == tour_id) && (tour.getMaxTouristsNumber() > tour.getTourists().size())) {
                String tourists = "";
                if (!tour.getTourists().isEmpty()) {
                    for (Tourist tourist : tour.getTourists()) {
                        System.out.println(tourist.getEmail());
                        tourists = tourists + "|" + tourist.getId() + "|";
                        if (tourist.getId() == this.getId()) {
                            System.out.println("Ti sei già prenotato a questo tour!");
                            return false;
                        }
                    }
                }
                try {
                    tourists = tourists + this.getId();
                    // create a mysql database connection
                    String myDriver = "com.mysql.cj.jdbc.Driver";
                    String myUrl = "jdbc:mysql://localhost:3306/cicero";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(myUrl, "root", "passwordina");
                    String query = "UPDATE tour set tourists = '" + tourists + "' WHERE tour_id = " + tour.getId();
                    PreparedStatement preparedStmt = conn.prepareStatement(query);
                    // execute the java preparedstatement
                    preparedStmt.executeUpdate();
                    tour.add_tourist(this);
                    return true;
                } catch (Exception e) {
                    System.err.println("Got an exception!");
                    System.out.println(e);
                }
            }
        }
        return false;
    }

    public boolean pay_tour(int tour_id){return false;}

    public void advertise_tour(int tour_id){}

    public void suggest_tour(){
        Scanner scan = new Scanner(System.in);
        String title, description;
        System.out.println("Inserisci il titolo");
        title = scan.nextLine();
        System.out.println("Inserisci la descrizione");
        description = scan.nextLine();
        Notification notification = new Notification(0,title, description, this.getId(), 0);
        notification.send_notification("Nuovo tour suggerito!");

    }

    public void invite_guest(String guest_email, List<Tourist> users){
        for(User user : users){
            if(user.getEmail().equals(guest_email)){
                Notification notification = new Notification(0,"Sei stato invitato a un tour!", this.getId()+" ti ha invitato a un tour!", this.getId(), 0);
                notification.send_notification("Nuovo invito!");
                System.out.println("Invito inviato");
            }
            else{
                System.out.println("Utente non presente nel sistema");
            }
        }
    }
}

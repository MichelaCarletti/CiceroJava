import java.util.List;

public class Guest {

    private int guest_id;
    private String email;
    private String password;
    private String name;
    private String surname;

    public Guest(int guest_id, String email, String password, String name, String surname){
        this.guest_id = guest_id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public boolean login(String user, String password, List<Guest> users){
        for(Guest single_user : users){
            if(single_user.email == user){
                if(single_user.password == password){
                    System.out.println("Login effettuato");
                    return true;
                }
                else{
                    System.out.println("Password errata");
                    return false;
                }
                return false;
            }
            else{
                System.out.println("Non esistono utenti con questo nome, effettua la registrazione");
                single_user.registration();
                return false;
            }
        }
    }

    public boolean change_password(String newPassword){return false;}

    public void logout(){}

    public void send_notification(){}

    public boolean registration(){return false;}
}

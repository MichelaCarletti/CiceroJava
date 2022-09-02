import java.util.List;

public class User {

    private int user_id;
    private String email;
    private String password;
    private String name;
    private String surname;

    public User(int user_id, String email, String password, String name, String surname){
        this.user_id = user_id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public boolean login(String user, String password, List<Tourist> users){
        for(User single_user : users){
            if(single_user.email.equals(user)){
                if(single_user.password.equals(password)){
                    System.out.println("Login effettuato");
                    return true;
                }
                else{
                    System.out.println("Password errata");
                    return false;
                }
            }
            else{
                System.out.println("Non esistono utenti con questo nome, effettua la registrazione");
                single_user.registration();
                return false;
            }
        }
        return false;
    }

    public boolean change_password(String newPassword){return false;}

    public void logout(){}

    public boolean registration(){return false;}
    public String getEmail(){
        return this.email;
    }

    public int getId(){
        return this.user_id;
    }

    public String getPassword(){
        return this.password;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
}

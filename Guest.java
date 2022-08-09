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

    public boolean login(String user, String password){return false;}

    public boolean change_password(String newPassword){return false;}

    public void logout(){}
}

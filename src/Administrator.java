public class Administrator extends User {

    public Administrator(int user_id, String email, String password, String name, String surname){
        super(user_id, email, password, name, surname);
    }

    public boolean approve_tag(int tag_id){return false;}

    public void assign_toponym(String toponym, int tour_id){}

    public boolean approve_discount(int discount_id){return false;}
}

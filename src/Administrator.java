public class Administrator extends Guest{

    public Administrator(int guest_id, String email, String password, String name, String surname){
        super(guest_id, email, password, name, surname);
    }

    public boolean approve_tag(int tag_id){return false;}

    public void assign_toponym(String toponym, int tour_id){}

    public boolean insert_tag(){return false;}

    public boolean modify_tag(int tag_id){return false;}

    public boolean delete_tag(int tag_id){return false;}
}

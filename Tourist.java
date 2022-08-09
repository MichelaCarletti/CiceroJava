public class Tourist extends Guest{

    public Tourist(int guest_id, String email, String password, String name, String surname){
        super(guest_id, email, password, name, surname);
    }

    public boolean book_tour(int tour_id){return false;}

    public boolean pay_tour(int tour_id){return false;}

    public void advertise_tour(int tour_id){}

    public void invite_guest(String email){}
}

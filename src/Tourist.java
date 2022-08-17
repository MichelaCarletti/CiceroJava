public class Tourist extends Guest{

    private String category;

    public Tourist(int guest_id, String email, String password, String name, String surname, String category){
        super(guest_id, email, password, name, surname);
        this.category = category;
    }

    public boolean book_tour(int tour_id){return false;}

    public boolean pay_tour(int tour_id){return false;}

    public void advertise_tour(int tour_id){}

    public void invite_guest(String email){}

    public void insert_review(){}
}

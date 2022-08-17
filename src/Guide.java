import java.util.ArrayList;
import java.util.List;

public class Guide extends Guest{

    private int association_id;
    private List<Review> reviews;

    public Guide(int association_id, int guest_id, String email, String password, String name, String surname){
        super(guest_id, email, password, name, surname);
        this.association_id = association_id;
        this.reviews = new ArrayList<>();
    }

    public void propose_tag(){}

    public boolean add_tour(){return false;}

    public boolean modify_tour(int tour_id){return false;}

    public boolean delete_tour(int tour_id){return false;}

    public void suggest_discount(){}
}

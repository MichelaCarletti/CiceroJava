import java.util.ArrayList;
import java.util.List;

public class Guide extends User {

    private int association_id;
    private List<Review> reviews;

    public Guide(int association_id, int user_id, String email, String password, String name, String surname){
        super(user_id, email, password, name, surname);
        this.association_id = association_id;
        this.reviews = new ArrayList<>();
    }

    public void propose_tag(){}

    public void suggest_discount(){}
}

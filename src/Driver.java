import java.util.ArrayList;
import java.util.List;

public class Driver extends User {

    private List<Vehicle> available_vehicles;

    public Driver(int user_id, String email, String password, String name, String surname) {
        super(user_id, email, password, name, surname);
        this.available_vehicles = new ArrayList<>();
    }

    public void offer_availability(){}

    public boolean accept_tour(){return false;}
}

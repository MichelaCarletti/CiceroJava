import java.util.ArrayList;
import java.util.List;

public class Driver extends Guest{

    private List<Transport> driven_transports;

    public Driver(int guest_id, String email, String password, String name, String surname) {
        super(guest_id, email, password, name, surname);
        this.driven_transports = new ArrayList<>();
    }

    public void offer_availability(){}
}

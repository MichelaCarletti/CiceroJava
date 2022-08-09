import java.util.ArrayList;
import java.util.List;

public class Shared {

    private int share_id;
    private int tourist_id;
    private int tour_id;
    List<String> gallery;

    public Shared(int share_id, int tourist_id, int tour_id){
        this.share_id = share_id;
        this.tourist_id = tourist_id;
        this.tour_id = tour_id;
        gallery = new ArrayList<>();
    }
}

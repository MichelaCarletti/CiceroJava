import java.util.ArrayList;
import java.util.List;

public class Step {

    private int step_id;
    private String title;
    private String description;
    private String start_time;
    private String end_time;
    private List<Toponym> toponyms;

    public Step(int step_id, String title, String description, String start_time, String end_time){
        this.step_id = step_id;
        this.title = title;
        this.description = description;
        this.start_time = start_time;
        this.end_time = end_time;
        toponyms = new ArrayList<>();
    }

    public int calculate_duration(){return 0;}
}

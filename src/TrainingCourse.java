import java.util.ArrayList;
import java.util.List;

public class TrainingCourse {

    private int training_course_id;
    private String title;
    private String description;
    private double cost;
    private int max_subscribers;
    private int min_subscribers;
    private String date;
    private String time;
    private List<Tourist> subscribers;

    public TrainingCourse(int training_course_id, String title, String description, double cost, int max_subscribers, int min_subscribers, String date, String time){
        this.training_course_id = training_course_id;
        this.title = title;
        this.description = description;
        this.cost = cost;
        this.max_subscribers = max_subscribers;
        this.min_subscribers = min_subscribers;
        this.date = date;
        this.time = time;
        this.subscribers = new ArrayList<>();
    }
}

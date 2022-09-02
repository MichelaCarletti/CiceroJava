import java.util.ArrayList;
import java.util.List;

public class Instructor extends User {

    private List<String> qualifications;
    private List<Review> reviews;
    private List<TrainingCourse> training_courses;

    public Instructor(int user_id, String email, String password, String name, String surname){
        super(user_id, email, password, name, surname);
        this.qualifications = new ArrayList<>();
        this.reviews = new ArrayList<>();
        this.training_courses = new ArrayList<>();
    }
}

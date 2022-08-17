import java.util.ArrayList;
import java.util.List;

public class Instructor extends Guest{

    private List<String> qualifications;
    private List<Review> reviews;

    public Instructor(int guest_id, String email, String password, String name, String surname){
        super(guest_id, email, password, name, surname);
        this.qualifications = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public boolean insert_training_course(){return false;}

    public boolean modify_training_course(int training_course_id){return false;}

    public boolean delete_training_course(int training_course_id){return false;}
}

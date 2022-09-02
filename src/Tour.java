import java.util.ArrayList;
import java.util.List;

public class Tour {

    private int tour_id;
    private String title;
    private String description;
    private int max_tourists_number;
    private int min_tourists_number;
    private int max_guest_reservation_days = 2;
    private String status;
    private double total_cost;
    private List<TourCosts> costs_list;
    private List<Tag> tag_list;
    private List<Day> days_list;
    private int guide_id;
    private List<Review> reviews;
    private List<TrainingCourse> training_courses;
    private String tipology;
    private int duration;
    private List<Tourist> tourists;

    public Tour(int tour_id, String title, String description, int max_tourists_number, int min_tourists_number, int max_guest_reservation_days, String status, List<TourCosts> costs_list, List<Day> days_list, int guide_id, String tipology, int duration, List<Tourist> tourists){
        this.tour_id = tour_id;
        this.title = title;
        this.description = description;
        this.max_tourists_number = max_tourists_number;
        this.min_tourists_number = min_tourists_number;
        this.max_guest_reservation_days = max_guest_reservation_days;
        this.status = status;
        this.total_cost = sum_costs();
        this.costs_list = costs_list;
        tag_list = new ArrayList<>();
        this.days_list = days_list;
        this.guide_id = guide_id;
        this.reviews = new ArrayList<>();
        this.training_courses = new ArrayList<>();
        this.tipology = tipology;
        this.duration = duration;
        this.tourists = tourists;
    }

    public double sum_costs(){return 0;}

    public boolean add_tag(int tag_id){return false;}

    public boolean remove_tag(int tag_id){return false;}

    public boolean change_status(String new_status){return false;}

    public boolean add_tour(){return false;}

    public boolean modify_tour(int tour_id){return false;}

    public boolean delete_tour(int tour_id){return false;}

    public String getTitle(){
        return this.title;
    }

    public int getId(){
        return this.tour_id;
    }

    public int getMaxTouristsNumber(){
        return this.max_tourists_number;
    }

    public List<Tourist> getTourists(){
        return this.tourists;
    }

    public void add_tourist(Tourist tourist){
        this.tourists.add(tourist);
    }
}

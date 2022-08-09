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
    private TourCosts costs_list;
    private List<Tag> tag_list;
    private List<Day> days_list;
    private int guide_id;

    public Tour(int tour_id, String title, String description, int max_tourists_number, int min_tourists_number, int max_guest_reservation_days,String status, TourCosts costs_list,List<Day> days_list,int guide_id){
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
    }

    public double sum_costs(){return 0;}

    public boolean add_tag(int tag_id){return false;}

    public boolean remove_tag(int tag_id){return false;}

    public boolean change_status(String new_status){return false;}
}

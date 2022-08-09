import java.util.List;

public class Day {

    private int tour_day_id;
    private String date;
    List<Step> steps_list;

    public Day(int tour_day_id, String date, List<Step> steps_list){
        this.tour_day_id = tour_day_id;
        this.date = date;
        this.steps_list = steps_list;
    }
}

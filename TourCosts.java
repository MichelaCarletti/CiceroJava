public class TourCosts {

    private int tour_costs_id;
    private double travel_cost;
    private double lunch_cost;
    private double dinner_cost;
    private double activity_cost;
    private double guide_cost;

    public TourCosts(int tour_costs_id, double travel_cost, double lunch_cost, double dinner_cost, double activity_cost, double guide_cost){
        this.tour_costs_id = tour_costs_id;
        this.travel_cost = travel_cost;
        this.lunch_cost = lunch_cost;
        this.dinner_cost = dinner_cost;
        this.activity_cost = activity_cost;
        this.guide_cost = guide_cost;
    }
}

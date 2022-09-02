public class TourCosts {

    private int tour_costs_id;
    private String name;
    private double amount;
    private int tour_id;

    public TourCosts(int tour_costs_id, String name, double amount, int tour_id){
        this.tour_costs_id = tour_costs_id;
        this.name = name;
        this.amount = amount;
        this.tour_id = tour_id;
    }
}

public class Booking {

    private int book_id;
    private String book_day;
    private int tourist_id;
    private int tour_id;

    public Booking(int book_id, String book_day, int tourist_id, int tour_id){
        this.book_id = book_id;
        this.book_day = book_day;
        this.tourist_id = tourist_id;
        this.tour_id = tour_id;
    }
}

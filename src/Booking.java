public class Booking {

    private int book_id;
    private String book_date;
    private int tourist_id;
    private int tour_id;
    private int discount_id;

    public Booking(int book_id, String book_date, int tourist_id, int tour_id, int discount_id){
        this.book_id = book_id;
        this.book_date = book_date;
        this.tourist_id = tourist_id;
        this.tour_id = tour_id;
        this.discount_id = discount_id;
    }
}

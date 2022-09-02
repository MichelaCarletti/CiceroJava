public class Review {

    private int review_id;
    private String title;
    private String description;
    private int vote;
    private int sender_id;
    private int recipient_id;

    public Review(int review_id, String title, String description, int vote, int sender_id, int recipient_id){
        this.review_id = review_id;
        this.title = title;
        this.description = description;
        this.vote = vote;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
    }

    public void insert_review(){}
}

public class Notification {

    private int notification_id;
    private String title;
    private String description;
    private int sender_id;
    private int recipient_id;

    public Notification(int notification_id, String title, String description, int sender_id, int recipient_id){
        this.notification_id = notification_id;
        this.title = title;
        this.description = description;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
    }
}

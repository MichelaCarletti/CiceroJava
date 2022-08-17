public class SaleRequest {

    private int sale_request_id;
    private int sender_id;
    private int recipient_id;
    private String status;
    private String date;

    public SaleRequest(int sale_request_id, int sender_id, int recipient_id, String status, String date){
        this.recipient_id = recipient_id;
        this.sender_id = sender_id;
        this.recipient_id = recipient_id;
        this.status = status;
        this.date = date;
    }
}

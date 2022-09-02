public class Discount {

    private int discount_id;
    private double amount;
    private String category;
    private boolean discount_type;

    public Discount(int discount_id, double amount, String category, boolean discount_type){
        this.discount_id = discount_id;
        this.amount = amount;
        this.category = category;
        this.discount_type = discount_type;
    }

    public boolean insert_discount(){return false;}

    public boolean modify_discount(int discount_id){return false;}

    public boolean delete_discount(int discount_id){return false;}
}

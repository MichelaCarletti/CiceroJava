public class Toponym {

    private int toponym_id;
    private String region;
    private String name;
    private String area;

    public Toponym(int toponym_id, String region, String name, String area){
        this.toponym_id = toponym_id;
        this.region = region;
        this.name = name;
        this.area = area;
    }

    public boolean insert_toponym(){return false;}

    public boolean modify_toponym(int toponym_id){return false;}

    public boolean delete_toponym(int toponym_id){return false;}
}

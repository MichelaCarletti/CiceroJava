public class Tag {

    private int tag_id;
    private String name;

    public Tag(int tag_id, String name){
        this.tag_id = tag_id;
        this.name = name;
    }

    public boolean insert_tag(){return false;}

    public boolean modify_tag(int tag_id){return false;}

    public boolean delete_tag(int tag_id){return false;}
}

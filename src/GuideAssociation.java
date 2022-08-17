import java.util.ArrayList;
import java.util.List;

public class GuideAssociation {

    private int association_id;
    private String name;
    private List<Guide> guides;

    public GuideAssociation(int association_id, String name){
        this.association_id = association_id;
        this.name = name;
        guides = new ArrayList<>();
    }

    public boolean add_guide(){return false;}

    public boolean remove_guide(int guide_id){return false;}
}

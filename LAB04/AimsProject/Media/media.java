package Media;
import java.util.Comparator;
public abstract class media {
    
    private	int id;
	private String title;
	private String category;
	private float cost;
	
    public static final Comparator<media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public media(String title) {
        this.title = title;
    }
    
    public media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public media(int id, String title,  String category,float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    public int getId() {
        return id;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
}

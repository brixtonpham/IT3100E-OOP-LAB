package Media;
import java.util.List;

public class Books extends media{    

    public Books(String title) {
        super(title);
    }
    
    public Books(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Books(int id, String category, String title, float cost) {
        super(id, category, title, cost);
    }

    private List<String> authors;

    public void addAuthor (String a) {
		boolean check = false;
		for (String i : authors) {
			if (i == a) {
				check = true;
				break;
			}
		}
		if (check == true)
			return;
		else authors.add(a);
	}
	
	public void removeAuthor (String a) {
		for (String i : authors) {
			if (i == a) {
				authors.remove(i);
				break;
			}
		}
		return;
	}

    public List<String> getAuthors() {
        return authors;
    }
    public int getContentLength() {
        return 10; 
    }

	@Override
    public String toString() {
		return ". Book - " + this.getTitle() + " - " +
		this.getCategory() +  " : " + this.getCost() + "$";
    }
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("This method is not valid in this type of media");
	}
}
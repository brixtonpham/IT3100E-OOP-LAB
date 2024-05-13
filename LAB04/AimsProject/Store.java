
import java.util.ArrayList;
import Media.*;

public class Store {
    private ArrayList<media> itemsInStore = new ArrayList<media>();

    public void addMedia(media disc) 
    {
        itemsInStore.add(disc);
    }

    public void removeMedia(media disc) 
    {
        for (media i : itemsInStore) 
        {
            if (i.equals(disc)) 
            {
                itemsInStore.remove(i);
                break;
            }
        }
    }

    public void viewStore() {
		int count = 0;
		for (media m : itemsInStore) {
			count = count + 1;
			System.out.println(count + m.toString());
		}
	}
	
	public void viewMediaDetails(String title) {
		int count = 0;
		for (media m:itemsInStore) {
			if (m.getTitle() == title) {
				count = count + 1;
				System.out.println(count + m.toString());
			}
		}
	}
	
	public media returnMediaDetails(String title) {
		for (media m:itemsInStore) {
			if (m.getTitle() == title) {
				return m;
			}
		}
		return null;
	}
}

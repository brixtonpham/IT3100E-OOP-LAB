package Media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<media> {

	public MediaComparatorByCostTitle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(media media1, media media2) {
		// TODO Auto-generated method stub
		int costComparison = Double.compare(media1.getCost(), media2.getCost());
		if (costComparison != 0) {
			return costComparison;
		}
		
		return media1.getTitle().compareTo(media2.getTitle());
	}

}
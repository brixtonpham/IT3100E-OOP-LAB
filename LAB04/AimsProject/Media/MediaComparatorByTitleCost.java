package Media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<media> {

	public MediaComparatorByTitleCost() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(media media1, media media2) {
		// TODO Auto-generated method stub
		int titleComparison = media1.getTitle().compareTo(media2.getTitle());
		if (titleComparison != 0) {
			return titleComparison;
		}
		
		return Double.compare(media1.getCost(), media2.getCost());
	}

}
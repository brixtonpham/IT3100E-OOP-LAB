import java.util.ArrayList;

import Media.CompactDisc;
import Media.DigitalVideoDisc;
public class Store {
    private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();

    public void addDVD(DigitalVideoDisc disc) 
    {
        itemsInStore.add(disc);
    }

    public void removeDVD(DigitalVideoDisc disc) 
    {
        for (DigitalVideoDisc i : itemsInStore) 
        {
            if (i.equals(disc)) 
            {
                itemsInStore.remove(i);
                break;
            }
        }
    }

    public void viewStore() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viewStore'");
    }

    public Object returnMediaDetails(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'returnMediaDetails'");
    }

    public void addMedia(DigitalVideoDisc dvd) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMedia'");
    }

    public void addMedia(DigitalVideoDisc dvd) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMedia'");
    }

    public void addMedia(DigitalVideoDisc dvd) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMedia'");
    }

    public void viewMediaDetails(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viewMediaDetails'");
    }
}

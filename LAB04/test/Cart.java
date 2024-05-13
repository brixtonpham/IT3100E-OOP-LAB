import java.util.ArrayList;

import Media.DigitalVideoDisc;
import Media.media;

public class Cart 
{
    private int qtyOrdered = 0;
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemOrderd = new ArrayList<>();
    //itemOrdered.ensureCapacity(MAX_NUMBER_ORDERED);

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1) 
    {
        itemOrderd.add(dvd1);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) 
    {
        for (DigitalVideoDisc i : itemOrderd) 
        {
            if (i.equals(disc)) 
            {
                itemOrderd.remove(i);
                break;
            }
        }
    }

    public float Total_Cost()
    {
        float sum = 0;
        for (DigitalVideoDisc i : itemOrderd) 
        {
                sum += i.get_cost();
        }

        return sum;
    }

    public void printCart() 
    {
        for (DigitalVideoDisc i : itemOrderd) 
        {
            i.displayDVD();
            System.out.println('\n');
        }
    }

    public void List_of_orders() 
    {    
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        
        double totalCost = 0;
        for (int i = 0; i < itemOrderd.size(); i++) 
        {
            DigitalVideoDisc item = itemOrderd.get(i);
            // Extract item details
            String title = item.get_title();
            String category = item.get_category();
            String director = item.get_director();
            int length = item.get_length();
            double cost = item.get_cost();
            
            // Print item details
            System.out.printf("%d. DVD - Title: %s - Category: %s - Director: %s - Length: %d - Cost: %.2f $\n", 
                (i + 1), title, category, director, length, cost);
            
            // Add item cost to total cost
            totalCost += cost;
        }
        
        // Print total cost
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }
    
    public void Search_by_ID(int id)
    {
        
    }

    public void Search_by_title(String title)
    {
        boolean found = false;
        for (DigitalVideoDisc i : itemOrderd) 
        {
            if (i.get_title() == title) 
            {
                i.displayDVD();
                System.out.println('\n');
                found = true;
            }
        }
        if (found == false) {
            System.out.println("No DVD found with the provided ID.");
        }
    }

    public void addMedia(Object returnMediaDetails) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addMedia'");
    }

    public char[] getLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLength'");
    }

    public void filterByTitle(String title_4) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'filterByTitle'");
    }

    public void sortByCost() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByCost'");
    }

    public void viewCart() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'viewCart'");
    }

    public void sortByTitle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sortByTitle'");
    }

    public void removeMedia(media a) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeMedia'");
    }

    public void clearList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clearList'");
    }
}
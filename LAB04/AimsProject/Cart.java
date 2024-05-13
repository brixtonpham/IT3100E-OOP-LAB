
import java.util.ArrayList;
import Media.*;
import java.util.Collections;

import javax.print.attribute.standard.Media;

public class Cart 
{
    //private int qtyOrdered = 0;
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<media> itemOrderd = new ArrayList<media>();
    //itemOrdered.ensureCapacity(MAX_NUMBER_ORDERED);

    public float Total_Cost()
    {
        float sum = 0;
        for (media i : itemOrderd) 
        {
                sum += i.getCost();
        }

        return sum;
    }

    public void sortByTitle() {
        Collections.sort(this.itemOrderd, media.COMPARE_BY_TITLE_COST );
    }
    
    public void sortByCost() {
        Collections.sort(this.itemOrderd, media.COMPARE_BY_COST_TITLE );
    }
    
    public int getLength(){
        return this.itemOrderd.size();
    }
    
    public void viewCart() {
        for (media item:itemOrderd ) {
            System.out.println(item.toString());
        }
    }

    public void filterByTitle(String title) {
        for (media m: itemOrderd) {
        if (m.getTitle().contains(title)) {
            System.out.println(m.toString());
            }
        }
    }
    public void clearList() {
        this.itemOrderd.clear();
    }

    public void addMedia(media media) {
        this.itemOrderd.add(media);
    }
    
    public media findMediaByTitle(String title) {
        for (media m:itemOrderd) {
            if (m.getTitle().compareTo(title) == 0) {return m;	} 
        }
        return null;
    }
    
    public void removeMedia(String title) {
        if (findMediaByTitle(title) != null ) {
            itemOrderd.remove(findMediaByTitle(title));
            System.out.println("Delete Item From Cart Successfully");
        }
    }
    public void List_of_orders() 
    {    
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        
        double totalCost = 0;
        for (int i = 0; i < itemOrderd.size(); i++) 
        {
            media item = itemOrderd.get(i);
            // Extract item details
            String title = item.getTitle();
            String category = item.getCategory();
            //String director = item.getDirector();
            //int length = item.getLength();
            double cost = item.getCost();
            
            // Print item details
            System.out.printf("%d. Title: %s - Category: %s -  Cost: %.2f $\n", 
                (i + 1), title, category, cost);
            
            // Add item cost to total cost
            totalCost += cost;
        }
        
        // Print total cost
        System.out.printf("Total cost: %.2f $\n", totalCost);
        System.out.println("***************************************************");
    }
}
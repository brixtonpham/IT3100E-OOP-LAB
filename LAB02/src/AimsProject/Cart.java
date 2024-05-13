import java.util.ArrayList;

public class Cart 
{
    private int qtyOrdered = 0;
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemOrderd = new ArrayList<>();
    //itemOrdered.ensureCapacity(MAX_NUMBER_ORDERED);

    public void addDigitalVideoDisc(DigitalVideoDisc disc) 
    {
        itemOrderd.add(disc);
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
}
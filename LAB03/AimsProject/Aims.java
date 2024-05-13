public class Aims 
{
    public static void main(String[] args) 
    {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Rogers Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);


        DigitalVideoDisc dvd2 = new DigitalVideoDisc("StarWars", "Science Fiction", "George Lucas"
        , 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //print total cost of the items in the cart
        System.out.printf("Total Cost is: %.2f", anOrder.Total_Cost());


        System.out.println("\nBefore: \n");
        anOrder.printCart();
        anOrder.removeDigitalVideoDisc(dvd1);
        System.out.println("After: \n");
        anOrder.printCart();

    }
}

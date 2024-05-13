package Media;
public class DigitalVideoDisc extends media implements Playable
{
    
    //attributes
    private String director;
    private int length;
    

    //function
    public boolean equals(DigitalVideoDisc a) {
        return (super.getTitle() == a.getTitle() && super.getCategory() == a.getCategory()&& this.getDirector() == a.getDirector() && this.getLength() == a.getLength() && super.getCost() == a.getCost());
    }

    public void displayDVD() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("Category: " + super.getCategory());
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("Cost: " + super.getCost());
    }

    public DigitalVideoDisc(String title) {
        super(title);
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
        super (title, category, cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super (title, category, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super (title, category, cost);
        this.director = director;
        this.length = length;
    }
    public String getDirector() {
        return this.director;
    }

    public int getLength() {
        return this.length;
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
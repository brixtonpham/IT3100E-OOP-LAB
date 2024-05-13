import Media.DigitalVideoDisc;

public class DigitalVideoDisc 
{
    
    //attributes
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    //function
    public boolean equals(DigitalVideoDisc a) 
    {
        return (this.title == a.title && this.category == a.category && this.director == a.director && this.length == a.length && this.cost == a.cost);
    }

    public void displayDVD() {
        System.out.println("Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("Cost: " + cost);
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc( String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.director = director;
        this.length = length;
    }

    public String get_title() {
        return this.title;
    }

    public String get_category() {
        return this.category;
    }

    public String get_director() {
        return this.director;
    }

    public int get_length() {
        return this.length;
    }

    public float get_cost() {
        return this.cost;
    }

    public void play() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'play'");
    }

}
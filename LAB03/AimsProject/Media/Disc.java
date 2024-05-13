package Media;

public class Disc extends media {

    private int length;
    private String director;

    public Disc(String title) { 
        super(title);
    }
    
    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String director, String category, String title, float cost) {
        super (category, title, cost);
        this.director = director;
    }

    public Disc(String title, String category, String director, int length, float cost) {
        super (category, title, cost);
        this.director = director;
        this.length = length;
    }

    public int getLength () {
        return this.length;
    }

    public String getDirector () {
        return this.director;
    }
    
}

package Media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> trackList = new ArrayList<>();

    public String getArtist() {
        return this.artist;
    }

    public CompactDisc(String title) { 
        super(title);
    }
    
    public CompactDisc(String title, String category, float cost) {
        super (title, category, cost);
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super (title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String director, String category, String title, float cost, String artist) {
        super (director, category, title, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
        super (title, category, director, length, cost);
        this.artist = artist;
    }
    
    public void addTrack(Track a) {
        boolean check = false;
        for (Track i : trackList) {
            if (i.equals(a)) {
                check = true;
                System.out.println("Error: Track is not found");
                break;
            }
        }
        if (!check) {
            trackList.add(a);
        }
    }
    
    public void removeTrack(Track a) {
        boolean found = false;
        for (Track i : trackList) {
            if (i.equals(a)) {
                trackList.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Error: Track is not found");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : trackList) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        System.out.println("CD going to be played:\n");
        for (Track i : trackList) {
            i.play();
        }
    }
}

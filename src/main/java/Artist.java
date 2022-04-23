import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<Artwork> artworkArtist;

    public Artist(String name){
        this.name =name;
        this.artworkArtist = new ArrayList<>();

    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public ArrayList<Artwork> getArtworkArtist() {return artworkArtist;}

    public void setArtworkArtist(ArrayList<Artwork> artworkArtist) {this.artworkArtist = artworkArtist;}

    public int numberOfArtwork(){
        return artworkArtist.size();
    }

    public String toString(){
        return "Artist name: " + this.name + ", discography: " + this.artworkArtist;
    }
}

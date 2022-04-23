import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> artworkGallery;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artworkGallery = new ArrayList<>();
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getTill() {return till;}



    public ArrayList<Artwork> getArtworkGallery() {return artworkGallery;}

    public void setArtworkGallery(ArrayList<Artwork> artworkGallery) {this.artworkGallery = artworkGallery;}

    public void addArtworkToGallery(Artwork artwork){
        this.artworkGallery.add(artwork);
    }

    public void increaseTill(Artwork artwork){
        this.till+=artwork.getPrice();
    }

    public int artworkNumberGallery(){
        return artworkGallery.size();

    }

    public void removeArt(Artwork artwork){
        this.artworkGallery.remove(artwork);
    }

    public static int stockTake(ArrayList<Artwork> artworkList, Gallery gallery){
        int sum =0;
        for(int i =0;i<gallery.getArtworkGallery().size();i++){
            sum+= gallery.getArtworkGallery().get(i).getPrice();
        }
        return sum;
    }



    @Override

    public String toString(){
        return "Gallery name: " + this.name + ", artwork collection: " + this.artworkGallery;

    }

}

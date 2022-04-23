import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;

    private ArrayList<Artwork> artworkCustomer;

    public Customer(String name, int walletValue){
        this.name = name;
        this.wallet = walletValue;
        this.artworkCustomer = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public ArrayList<Artwork> getArtworkCustomer() {
        return artworkCustomer;
    }

    public void setArtworkCustomer(ArrayList<Artwork> artworkCustomer) {
        this.artworkCustomer = artworkCustomer;
    }

    public void buyArtwork(Artwork artwork, Gallery gallery){
        this.wallet-= artwork.getPrice();
        gallery.increaseTill(artwork);
        gallery.removeArt(artwork);
        addArtworkCustomer(artwork);


    }

    public int customerArtworkListSize(){
        return this.artworkCustomer.size();
    }

    public void addArtworkCustomer(Artwork artwork){
        this.artworkCustomer.add(artwork);
    }

    @Override
    public String toString(){
        return "Customer name: " + this.name;

    }
}

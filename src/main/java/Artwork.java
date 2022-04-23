import java.util.ArrayList;

import static java.lang.Math.abs;

public class Artwork {

    private String title;
    private Artist artist;
    private int price;
    private String nft;





    public Artwork(String title, Artist artist, int price, String nft, Gallery gallery){
        this.title = title;
        this.artist =artist;


        this.price = abs(price);

        this.nft = nftChecker(nft,gallery);







        //test



    }

    public String getTitle() {return title;}

    public void setTitle(String title) {this.title = title;}

    public Artist getArtist() {return artist;}

    public void setArtist(Artist artist) {this.artist = artist;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public String getNft() {return nft;}

    public void setNft(String nft) {this.nft = nft;}

    public String nftChecker(String nft, Gallery gallery){
        for(int i=0; i<gallery.artworkNumberGallery();i++){
            if(gallery.getArtworkGallery().get(i).getNft().equals(nft)){
                return "NFT already in use. Set another.";
            }

        }
        return nft;
    }









    @Override
    public String toString() {
        return "Artwork:" +
                "title='" + title + '\'' +
                ", artist=" + artist +
                ", price=" + price +
                ", nft='" + nft + '\'' +
                '}';
    }
}

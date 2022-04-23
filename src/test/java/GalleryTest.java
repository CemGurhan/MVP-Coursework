import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GalleryTest {

    private Gallery testGallery;
    private Artwork testArtwork;

    private Artist testArtist;

    private Customer testCustomer;

    private Artwork testArtwork2;

    @BeforeEach
    void setup(){
        testGallery = new Gallery("test gallery");
        testArtist = new Artist("Cem");
        testArtwork = new Artwork("testArtwork", testArtist, 100, "qqqqq",testGallery);
        testArtwork2 = new Artwork("testArtwork2", testArtist, 100, "wwww",testGallery);
        testCustomer = new Customer("testCustomer", 230);

    }


    @Test

    void emptyArtworktest (){


        assertEquals(0 , testGallery.artworkNumberGallery());

    }

    @Test

    void artworkNumberTest(){
        testGallery.addArtworkToGallery(testArtwork);
        assertEquals(1, testGallery.artworkNumberGallery());



    }
    @Test

    void artworkIncreaseTillTest(){

        testGallery.increaseTill(testArtwork);
        assertEquals(testArtwork.getPrice(),testGallery.getTill());
    }

    @Test

    void addArtworkGallerytest(){
        testGallery.addArtworkToGallery(testArtwork);
        assertTrue(testGallery.getArtworkGallery().contains(testArtwork));
    }

    @Test

    void removeArtworkGallery(){
        testGallery.addArtworkToGallery(testArtwork);
        testGallery.removeArt(testArtwork);
        assertEquals(0, testGallery.artworkNumberGallery());
    }

    @Test

    void stockTakeTest(){
        testGallery.addArtworkToGallery(testArtwork);
        testGallery.addArtworkToGallery(testArtwork2);
        int stockTake = Gallery.stockTake(testGallery.getArtworkGallery(),testGallery);
        assertEquals(testArtwork.getPrice()+testArtwork2.getPrice(),stockTake);


    }



}

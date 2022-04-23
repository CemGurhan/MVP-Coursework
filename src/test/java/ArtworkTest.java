import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtworkTest {
    private Gallery testGallery;
    private Artwork testArtwork;

    private Artist testArtist;

    private Artwork testArtwork2;

    private Artwork testArtworkNegative;

    private Customer testCustomer;

    @BeforeEach
    void setup(){
        testGallery = new Gallery("test gallery");
        testArtist = new Artist("Cem");
        testArtwork = new Artwork("testArtwork", testArtist, 100, "qqqqq",testGallery);
        testArtwork2 = new Artwork("testArtwork", testArtist, 100, "qqqqq",testGallery);
        testArtworkNegative = new Artwork("negative", testArtist, -100,"qqqq",testGallery);
        testCustomer = new Customer("testCustomer", 230);

    }




    @Test

    void nftCheckerTest(){
        testGallery.addArtworkToGallery(testArtwork);

        assertTrue(testArtwork2.getNft().equals("NFT already in use. Set another."));
    }

    @Test

    void testNegativePriceArtwork(){

        assertTrue(testArtworkNegative.getPrice()>0);
    }

}

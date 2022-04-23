import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistTest {

    private Gallery testGallery;

    private Artwork testArtwork;

    private Artist testArtist;

    private Customer testCustomer;

    @BeforeEach

    void setup(){

        testGallery = new Gallery("test gallery");
        testArtist = new Artist("Cem");
        testArtwork = new Artwork("testArtwork", testArtist, 100, "qqqqq",testGallery);

        testCustomer = new Customer("testCustomer", 230);

    }

    @Test

    void arrayListEmptyTestArtist(){
        assertEquals(0,testArtist.numberOfArtwork());
    }




}

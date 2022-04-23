import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    private Gallery testGallery;
    private Artwork testArtwork;

    private Artist testArtist;

    private Customer testCustomer;

    @BeforeEach
    void setup(){
        testGallery = new Gallery("test gallery");
        testArtist = new Artist("Cem");
        testArtwork = new Artwork("testArtwork", testArtist, 100, "qqqqq", testGallery);

        testCustomer = new Customer("testCustomer", 230);

    }

    @Test
    void customerArrayEmptyTest(){
        assertEquals(0, testCustomer.customerArtworkListSize());
    }

    @Test
     void customerBuysArtworkTest(){
        int oldCustomerWallet = testCustomer.getWallet();
        testCustomer.buyArtwork(testArtwork, testGallery);
        assertEquals(testCustomer.getWallet()+testGallery.getTill(),oldCustomerWallet);
        assertFalse(testGallery.getArtworkGallery().contains(testArtwork));
        assertTrue(testCustomer.getArtworkCustomer().contains(testArtwork));

    }

    @Test

    void addArtworkCustomerTest(){
        testCustomer.addArtworkCustomer(testArtwork);
        assertTrue(testCustomer.getArtworkCustomer().contains(testArtwork));
    }

}

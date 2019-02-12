import Stalls.BeerStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeerStallTest {

    BeerStall beerStall;


    @Before
    public void before(){
        beerStall = new BeerStall("Bop Beers", "Lindsay McKenzie", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Bop Beers", beerStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Lindsay McKenzie", beerStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(1, beerStall.getParkingSpot());
    }
}

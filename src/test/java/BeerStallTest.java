import Stalls.BeerStall;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BeerStallTest {

    BeerStall beerStall;
    Visitor visitor;


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

    @Test
    public void canBuyABeer(){
        visitor = new Visitor("James Sansum",32, 190, 25.50);
        assertEquals(true, beerStall.isAllowedTo(visitor));
    }

    @Test
    public void cantBuyABeer(){
        visitor = new Visitor("Craig Smith",17, 188, 21.00);
        assertEquals(false, beerStall.isAllowedTo(visitor));
    }
}



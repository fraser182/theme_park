import Attractions.Dodgems;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        dodgems = new Dodgems("Rockin' Dodgems", 4.50);
    }

    @Test
    public void hasName(){
        assertEquals("Rockin' Dodgems", dodgems.getName());
    }

    @Test
    public void canShowDefaultPrice(){
        assertEquals(4.50,  dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeHalfPriceForVisitorUnder12(){
        visitor = new Visitor("Lilly Ross",8, 105, 4.50);
        assertEquals(2.25,  dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void canChargeDefaultPriceForVisitorOver12(){
        visitor = new Visitor("McKenzie Ross",13, 135, 9.50);
        assertEquals(4.50,  dodgems.priceFor(visitor), 0.01);
    }

    @Test
    public void canGetInitialRating(){
        assertEquals(0,  dodgems.getRating());
    }

    @Test
    public void canGetName(){
        assertEquals("Rockin' Dodgems", dodgems.getName());
    }
}

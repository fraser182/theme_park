import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Belle's Ice-Cream", "Belle Ross", 3);
    }


    @Test
    public void hasName(){
        assertEquals("Belle's Ice-Cream", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Belle Ross", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, iceCreamStall.getParkingSpot());
    }


}

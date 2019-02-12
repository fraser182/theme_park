import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Julia's Floss", "Julia McKenzie", 2);
    }

    @Test
    public void hasName(){
        assertEquals("Julia's Floss", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Julia McKenzie", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(2, candyFlossStall.getParkingSpot());
    }
}

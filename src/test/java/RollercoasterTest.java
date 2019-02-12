import Attractions.Rollercoaster;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Raptor", 8.40);
    }

    @Test
    public void hasName(){
        assertEquals("Raptor", rollercoaster.getName());
    }

    @Test
    public void canRideRollerCoaster(){
        visitor = new Visitor("Calum Fraser",32, 190, 25.50);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void cantRideRollerCoasterBecauseTheyAreTooSmall(){
        visitor = new Visitor("Pixie McTaggart",24, 140, 8.00);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void cantRideRollerCoasterBecauseTheyAreTooYoung(){
        visitor = new Visitor("John McYoung",12, 167, 5.50);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void canShowDefaultPrice(){
        assertEquals(8.40,  rollercoaster.defaultPrice(), 0.01);
    }


    @Test
    public void canShowDefaultPriceForVisitorUnder200cm(){
        visitor = new Visitor("John McYoung",27, 167, 5.50);
        assertEquals(8.40, rollercoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void canShowDoubleDefaultPriceForVisitorOver200cm(){
        visitor = new Visitor("Mike Wright",30, 201, 15.50);
        assertEquals(16.80, rollercoaster.priceFor(visitor), 0.001);
    }
}

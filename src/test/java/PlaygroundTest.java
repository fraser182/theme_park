import Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;


    @Before
    public void before(){
        playground = new Playground("Crazy Fun House");

    }


    @Test
    public void hasName(){
        assertEquals("Crazy Fun House", playground.getName());
    }

    @Test
    public void canGoIntoPlayground(){
        visitor = new Visitor("Lady Ross",10, 146, 12.00);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void cantGoIntoPlayground(){
        visitor = new Visitor("Lilly McFace",16, 180, 19.00);
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void canGetRating(){
        assertEquals(0,  playground.getRating());
    }
}

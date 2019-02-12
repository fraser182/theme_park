import Attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Rockin' Dodgems");
    }

    @Test
    public void hasName(){
        assertEquals("Rockin' Dodgems", dodgems.getName());
    }




}

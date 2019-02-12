import Attractions.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Park park;
    Playground playGround;


    @Before
    public void before(){
        themePark = new ThemePark("Wonderland");
        rollercoaster = new Rollercoaster("Super Dooper Looper");
        dodgems = new Dodgems("Rockin' Dodgems");
        park = new Park("Wonderland");
        playGround = new Playground("Crazy Fun House");
    }


    @Test
    public void canCheckAttractionsArrayIsEmpty(){
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void canAddAttractions(){
       themePark.addAttraction(rollercoaster);
       themePark.addAttraction(dodgems);
       themePark.addAttraction(park);
       themePark.addAttraction(playGround);
       assertEquals(4, themePark.countAttractions());
    }


}

import Attractions.*;
import Stalls.BeerStall;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;

    Visitor visitor;

    Rollercoaster rollercoaster;
    Dodgems dodgems;
    Park park;
    Playground playGround;

    BeerStall beerStall;
    CandyFlossStall candyFlossStall;
    IceCreamStall iceCreamStall;



    @Before
    public void before(){
        themePark = new ThemePark("Wonderland");

        visitor = new Visitor("Lady Ross", 15, 146, 12.00);

        rollercoaster = new Rollercoaster("Super Dooper Looper");
        dodgems = new Dodgems("Rockin' Dodgems");
        park = new Park("Wonderland");
        playGround = new Playground("Crazy Fun House");

        beerStall = new BeerStall("Bop Beers", "Lindsay McKenzie", 1);
        candyFlossStall = new CandyFlossStall("Julia's Floss", "Julia McKenzie", 2);
        iceCreamStall = new IceCreamStall("Belle's Ice-Cream", "Belle Ross", 3);


    }


    @Test
    public void canCheckAttractionsArrayListIsEmpty(){
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void canCheckStallsArrayListIsEmpty(){
        assertEquals(0, themePark.countStalls());
    }

    @Test
    public void canAddAttractions(){
       themePark.addAttraction(rollercoaster);
       themePark.addAttraction(dodgems);
       themePark.addAttraction(park);
       themePark.addAttraction(playGround);
       assertEquals(4, themePark.countAttractions());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(beerStall);
        themePark.addStall(candyFlossStall);
        themePark.addStall(iceCreamStall);
        assertEquals(3, themePark.countStalls());
    }

    @Test
    public void canVisitTheRollerCoaster(){
        String result = themePark.visitAttraction(visitor, rollercoaster);
        assertEquals("Lady Ross, aged 15, at a height of 146cm, rode the Super Dooper Looper Roller Coaster.", result);
    }



}

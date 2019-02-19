import Attractions.*;
import Stalls.BeerStall;
import Stalls.CandyFlossStall;
import Stalls.IceCreamStall;
import ThemePark.ThemePark;
import ThemePark.Visitor;
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

        rollercoaster = new Rollercoaster("Super Dooper Looper", 8.40);
        dodgems = new Dodgems("Rockin' Dodgems", 4.50);
        park = new Park("Wonderland");
        playGround = new Playground("Crazy Fun House");

        beerStall = new BeerStall("Bop Beers", "Lindsay McKenzie", 1, 6.60);
        candyFlossStall = new CandyFlossStall("Julia's Floss", "Julia McKenzie", 2, 4.20);
        iceCreamStall = new IceCreamStall("Belle's Ice-Cream", "Belle Ross", 3, 2.80);

        themePark.addAttraction(rollercoaster);
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playGround);

        themePark.addStall(beerStall);
        themePark.addStall(candyFlossStall);
        themePark.addStall(iceCreamStall);

        rollercoaster.newRating(10);
        dodgems.newRating(8);
        park.newRating(7);
        playGround.newRating(7);

        beerStall.newRating(9);
        candyFlossStall.newRating(6);
        iceCreamStall.newRating(8);
    }

    @Test
    public void hasName(){
        assertEquals("Wonderland", themePark.getName());
    }

    @Test
    public void canCountAttractions(){
       assertEquals(4, themePark.countAttractions());
    }

    @Test
    public void canCountStalls(){
        assertEquals(3, themePark.countStalls());
    }

    @Test
    public void canVisitTheRollerCoaster(){
        String result = themePark.visitAttraction(visitor, rollercoaster);
        assertEquals("Lady Ross, aged 15, at a height of 146cm, rode the Super Dooper Looper Roller Coaster.", result);
    }

    @Test
    public void canGetAllVisitorsAllowedEntry(){

    }


    @Test
    public void canReturnAllReviews(){
        assertEquals(7, themePark.getAllReviewed().size());
    }

    @Test
    public void canViewAllReviews() {
        assertEquals("Super Dooper Looper: 10 , Rockin' Dodgems: 8 , Wonderland: 7 , Crazy Fun House: 7 , Bop Beers: 9 , Julia's Floss: 6 , Belle's Ice-Cream: 8", themePark.viewAllReviews());
    }
}

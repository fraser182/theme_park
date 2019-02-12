import Attractions.Attraction;
import Attractions.Rollercoaster;
import Stalls.BeerStall;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;
    private String name;

    public ThemePark(String name) {
        this.name = name;
        this.stalls = new ArrayList<Stall>();
        this.attractions = new ArrayList<Attraction>();

    }

    public int countAttractions() {
        return this.attractions.size();
    }

    public int countStalls() {
        return this.stalls.size();
    }


    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }


    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public String visitAttraction(Visitor visitor, Attraction attraction) {
        return  visitor.getName() + ", aged " + visitor.getAge() + ", at a height of " + visitor.getHeight() +
                "cm, rode the " + attraction.getName() + " Roller Coaster.";
    }



}

import Attractions.Attraction;
import Attractions.Rollercoaster;
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


    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }


}

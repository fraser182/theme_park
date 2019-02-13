package ThemePark;

import Attractions.Attraction;
import Interfaces.IReviewed;
import Interfaces.ITicketed;
import Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;
    private String name;
    private ArrayList<ITicketed> parkEntry;

    public ThemePark(String name) {
        this.name = name;
        this.stalls = new ArrayList<Stall>();
        this.attractions = new ArrayList<Attraction>();
        this.parkEntry = new ArrayList<ITicketed>();

    }

    public String getName() {
        return this.name;
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
        return visitor.getName() + ", aged " + visitor.getAge() + ", at a height of " + visitor.getHeight() +
                "cm, rode the " + attraction.getName() + " Roller Coaster.";
    }

//    public ArrayList<ITicketed> getAllAllowedFor(Visitor vistor){
//        ArrayList<ITicketed> allVisitorsAllowedEntry = new ArrayList<ITicketed>();
//        for ()
//
//    }

    public ArrayList<IReviewed> getAllReviewed() {
        ArrayList<IReviewed> allParkReviewed = new ArrayList<IReviewed>();
        for (Attraction attraction : this.attractions) {
            allParkReviewed.add(attraction);
        }
        for (Stall stall : this.stalls) {
            allParkReviewed.add(stall);
        }
        return allParkReviewed;
    }

    public String viewAllReviews() {
        String allParkReviews = "";
        for (Attraction attraction : this.attractions) {
            allParkReviews += attraction.getName() + ": " + attraction.getRating() + " , ";
        }
        for (Stall stall : this.stalls) {
            allParkReviews += stall.getName() + ": " + stall.getRating() + " , ";
        }
        return allParkReviews;
    }

}

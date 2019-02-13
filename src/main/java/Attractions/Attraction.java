package Attractions;

import Interfaces.IReviewed;

public abstract class Attraction implements IReviewed {

    //    Using a Attraction abstract class (which has a name)
    private String name;
    private int rating;

    public Attraction(String name) {
        this.name = name;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public void newRating(int rating){
        this.rating = rating;
    }
}
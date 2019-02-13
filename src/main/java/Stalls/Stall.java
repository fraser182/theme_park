package Stalls;

import Interfaces.IReviewed;

public abstract class Stall implements IReviewed {

//    Using a Stall abstract class (which has a name,
//    ownerName and parkingSpot)

    private String name;
    private String ownerName;
    private int parkingSpot;
    private double itemStartingPrice;
    private int rating;

    public Stall(String name, String ownerName, int parkingSpot, double itemStartingPrice ) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.itemStartingPrice = itemStartingPrice;
        this.rating = 0;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSpot(){
        return this.parkingSpot;
    }

    public double getItemStartingPrice(){
        return this.itemStartingPrice;
    }

    public int getRating(){
        return this.rating;
    }

    public void newRating(int rating){
        this.rating = rating;
    }
}

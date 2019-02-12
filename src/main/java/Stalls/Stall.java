package Stalls;

public abstract class Stall {

//    Using a Stall abstract class (which has a name,
//    ownerName and parkingSpot)

    private String name;
    private String ownerName;
    private int parkingSpot;
    private double itemStartingPrice;

    public Stall(String name, String ownerName, int parkingSpot, double itemStartingPrice ) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.itemStartingPrice = itemStartingPrice;
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
}

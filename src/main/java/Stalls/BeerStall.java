package Stalls;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class BeerStall extends Stall implements ISecurity {

    public BeerStall(String name, String ownerName, int parkingSpot, double itemStartingPrice) {
        super(name, ownerName, parkingSpot, itemStartingPrice);
    }

    public  boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        } return false;
    }

}


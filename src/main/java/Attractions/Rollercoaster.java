package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import ThemePark.Visitor;

public class Rollercoaster extends Attraction implements ISecurity, ITicketed {

    private double price;

    public Rollercoaster(String name, double price){
        super(name);
        this.price = price;
    }


    public  boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        } return false;
    }


    public double defaultPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
     if (visitor.getHeight() > 200){
         return this.price*2;
     }
     return defaultPrice();
    }


}

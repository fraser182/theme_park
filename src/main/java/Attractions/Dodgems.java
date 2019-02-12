package Attractions;

import Interfaces.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;

    public Dodgems (String name, double price){
        super(name);
        this.price = price;
    }


   public double defaultPrice(){
        return this.price;
   }

   public double priceFor(Visitor visitor){
    if (visitor.getAge() < 12){
        return defaultPrice()/2;
    } return defaultPrice();
   }
}
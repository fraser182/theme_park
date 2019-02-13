package Attractions;

import Interfaces.ITicketed;
import ThemePark.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    private double price;
    private int rating;

    public Dodgems (String name, double price){
        super(name);
        this.price = price;
        this.rating = 0;
    }


   public double defaultPrice(){
        return this.price;
   }

   public double priceFor(Visitor visitor){
    if (visitor.getAge() < 12){
        return this.price /2;
    } return this.price;
   }
}
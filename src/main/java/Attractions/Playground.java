package Attractions;

import Interfaces.ISecurity;
import ThemePark.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int rating;

    public Playground (String name){
        super(name);
        this.rating = 0;
    }

   public  boolean isAllowedTo(Visitor visitor) {
       if (visitor.getAge() <= 15) {
           return true;
       } return false;
   }


}
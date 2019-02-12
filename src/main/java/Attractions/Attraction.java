package Attractions;

public abstract class Attraction {

    //    Using a Attraction abstract class (which has a name)
    private String name;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
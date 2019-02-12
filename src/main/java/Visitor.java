public class Visitor {

//    Visitor has age, height, money
    private String name;
    private int age;
    private int height;
    private double money;

    public Visitor(String name, int age, int height, double money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }


    public int getHeight() {
        return this.height;
    }


    public double getMoney() {
        return this.money;
    }
}

package Car;

import Components.Engine;

public class Car {

    private String colour;
    private int price;
    private Engine engine;

    public Car(String colour, int price, Engine engine){
        this.colour = colour;
        this.price = price;
        this.engine = engine;
    }

    public String getColour() {
        return colour;
    }

    public int getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public int rent(){
        return price/20;
    }
}

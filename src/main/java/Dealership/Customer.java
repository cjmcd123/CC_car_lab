package Dealership;
import Car.*;

public class Customer {

    private String name;
    private int money;
    private Car car;

    public Customer(String name, int money){
        this.name = name;
        this.money = money;
        this.car = null;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

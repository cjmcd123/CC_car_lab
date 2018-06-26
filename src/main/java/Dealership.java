import Dealership.*;
import Car.*;


import java.util.ArrayList;

public class Dealership {

    private String name;
    private Till till;
    private ArrayList<Car> cars;
    private ArrayList<Car> rented;

    public Dealership(String name, Till till, ArrayList<Car> cars) {
        this.name = name;
        this.till = till;
        this.cars = cars;
        this.rented = new ArrayList<Car>();
    }

    public String getName() {
        return this.name;
    }

    public Till getTill() {
        return till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public String sellCar(Customer customer,Dealer dealer,Car car) {
        int price = car.getPrice();
        customer.setCar(car);
        this.cars.remove(car);
       int money = customer.getMoney();
       customer.setMoney(money - price);
       int till = this.till.getMoney();
       this.till.setMoney(till + price);
       return dealer.getName() + " sold the car to " + customer.getName();

    }

    public String rentCar(Customer customer,Dealer dealer,Car car) {
        int price = car.rent();
        customer.setCar(car);
        this.rented.add(car);
        this.cars.remove(car);
        int money = customer.getMoney();
        customer.setMoney(money - price);
        int till = this.till.getMoney();
        this.till.setMoney(till + price);
        return dealer.getName() + " rented the car to " + customer.getName();

    }

    public ArrayList<Car> getRented() {
        return rented;
    }

    public void setRented(ArrayList<Car> rented) {
        this.rented = rented;
    }
}

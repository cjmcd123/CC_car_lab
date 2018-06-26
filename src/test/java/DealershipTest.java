import Components.Engine;
import Dealership.*;
import Car.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Till till;
    Customer customer;
    Dealer dealer;

    @Before
    public void setUp(){
        till = new Till(1000);
        Engine engine = new Engine("Ferrari", 16);
        car = new Car("Jasper Green", 12000, engine);
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(car);
        dealership = new Dealership("CodeClan Cars", till, cars);
        dealer = new Dealer("Bob");
        customer = new Customer("Jim", 15000);
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Cars", dealership.getName());
    }

    @Test
    public void hasTill(){
        assertEquals(1000, dealership.getTill().getMoney());
    }

    @Test
    public void hasCars(){
        assertEquals(1, dealership.getCars().size());
    }

    @Test
    public void sellCar(){
        String result = dealership.sellCar(customer,dealer,car);
        assertEquals("Bob sold the car to Jim", result);
        assertEquals(13000, dealership.getTill().getMoney());
        assertEquals(3000, customer.getMoney());

    }

    @Test
    public void rentCar(){
        String result = dealership.rentCar(customer,dealer,car);
        assertEquals("Bob rented the car to Jim", result);
        assertEquals(1600, dealership.getTill().getMoney());
        assertEquals(14400, customer.getMoney());
        assertEquals(1, dealership.getRented().size());

    }

}

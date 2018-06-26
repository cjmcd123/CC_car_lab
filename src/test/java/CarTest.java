import Components.Engine;
import org.junit.Before;
import org.junit.Test;
import Car.*;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine("Audi", 8);
        car = new Car("Red", 12000, engine);
    }

    @Test
    public void carHasColour(){
        assertEquals("Red", car.getColour());
    }

    @Test
    public void carHasPrice(){
        assertEquals(12000, car.getPrice());
    }

    @Test
    public void carEngine(){
        String result = car.getEngine().getMake();
        assertEquals("Audi", result);
    }
}

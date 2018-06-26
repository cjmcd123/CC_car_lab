import Dealership.Till;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TillTest {

    Till till;

    @Before
    public void setUp(){
        till = new Till(10);
    }

    @Test
    public void hasMoney(){
        assertEquals(10, till.getMoney());
    }
}

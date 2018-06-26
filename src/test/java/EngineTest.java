import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {


    Engine engine;

    @Before
    public void before(){
        engine = new Engine("Honda", 12);
    }

    @Test
    public void hasMake(){
        assertEquals("Honda", engine.getMake());

    }

    @Test
    public void hasTread(){
        assertEquals(12, engine.getCylinder());

    }

}
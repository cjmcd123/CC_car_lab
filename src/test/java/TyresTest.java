import Components.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest   {

    Tyres tyres;

    @Before
    public void before(){
        tyres = new Tyres("Pirelli", "Slick", 5);
    }

    @Test
    public void hasMake(){
        assertEquals("Pirelli", tyres.getMake());

    }

    @Test
    public void hasTread(){
        assertEquals("Slick", tyres.getTread());

    }

    @Test
    public void hasDurability(){
        assertEquals(5, tyres.getDurability());
    }
}

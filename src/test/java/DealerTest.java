import Components.*;

import Dealership.Dealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest   {

    Dealer dealer;

    @Before
    public void before(){
        dealer = new Dealer(" Arnold Clark");
    }

    @Test
    public void hasDelear(){
        assertEquals(" Arnold Clark", dealer.getName());

    }

}

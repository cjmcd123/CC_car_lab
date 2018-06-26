import Components.*;

import Dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
        customer = new Customer("Bob", 15000);
    }

    @Test
    public void hasName() {
        assertEquals("Bob", customer.getName());

    }

    @Test
    public void hasMoney() {
        assertEquals(15000, customer.getMoney());

    }

}

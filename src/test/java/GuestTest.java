import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest mike;

    @Before
    public void before(){
        mike = new Guest("Mike");
    }

    @Test
    public void hasName(){
        assertEquals("Mike", mike.getName());
    }
}

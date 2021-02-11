import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    ArrayList<Guest> guests;
    Guest mike;

    @Before
    public void before(){
        mike = new Guest("Mike");
        //guests.add(mike);
        bedroom = new Bedroom(1, guests, RoomType.SINGLE, 1 );
        bedroom.addGuest(mike);

        //ArrayList<Guest> guests = new ArrayList<Guest>();

    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void startsWithNoGuests(){
        assertEquals(1, bedroom.getGuestsCount());
    }


}

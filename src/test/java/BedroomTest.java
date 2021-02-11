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
        bedroom = new Bedroom(1, guests, RoomType.SINGLE, 1 );



    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(mike);
        assertEquals(1, bedroom.getGuestsCount());
    }

    @Test
    public void hasRoomType(){
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }




}

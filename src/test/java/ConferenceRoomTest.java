import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(4, guests, "Presidential Suite");
    }

    @Test
    public void hasName() {
        assertEquals("Presidential Suite", conferenceRoom.getRoomName());
    }
}

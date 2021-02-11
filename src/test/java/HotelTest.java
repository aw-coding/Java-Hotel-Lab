import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest mike;

    ArrayList<Guest> guests;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        hotel = new Hotel(8, 3);
        mike = new Guest("Mike");
        bedroom1 = new Bedroom(1, guests, RoomType.SINGLE, 1 );
        bedroom2 = new Bedroom(2, guests, RoomType.DOUBLE, 2 );
        bedroom3 = new Bedroom(3, guests, RoomType.TRIPLE, 3 );
        conferenceRoom1 = new ConferenceRoom(5, guests, "Di Massimo Suite");

    }

    @Test
    public void hasBedroom(){
        assertEquals(8, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(3, hotel.getNumberOfConferenceRooms());
    }

//    @Test
//    public void guestHasCheckedIn(){
//        hotel.checkInGuestToBedroom(mike, 2);
//        assertEquals(1, bedroom2.getRoomGuests().size());
//    }



}

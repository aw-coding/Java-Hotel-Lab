import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest mike;

    ArrayList<Guest> guests;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        hotel = new Hotel(bedrooms, conferenceRooms );
        mike = new Guest("Mike");
        bedroom1 = new Bedroom(1, guests, RoomType.SINGLE, 1 );
        bedroom2 = new Bedroom(2, guests, RoomType.DOUBLE, 2 );
        bedroom3 = new Bedroom(3, guests, RoomType.TRIPLE, 3 );
        conferenceRoom1 = new ConferenceRoom(5, guests, "Di Massimo Suite");
        hotel.addBedroomToHotel(bedroom1);
        hotel.addBedroomToHotel(bedroom2);
        hotel.addBedroomToHotel(bedroom3);
        hotel.addConferenceRoomToHotel(conferenceRoom1);

    }

    @Test
    public void hasBedroom(){
        assertEquals(3, hotel.getNumberOfBedrooms());
    }

    @Test
    public void hasConferenceRooms(){
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void guestHasCheckedIntoBedroom(){
        hotel.checkInGuestToBedroom(mike, 2);
        assertEquals(1, bedroom2.getGuestsCount());
    }

    @Test
    public void guestHasCheckedIntoConferenceRoom(){
        hotel.checkInGuestToConferenceRoom(mike, "Di Massimo Suite");
        assertEquals(1, conferenceRoom1.getGuestsCount());
    }



}

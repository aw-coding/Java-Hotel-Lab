import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom1;
    ArrayList<Guest> guests;

    @Before
    public void before(){
        bedroom1 = new Bedroom(1, guests, RoomType.SINGLE, 1 );
        booking = new Booking(bedroom1, 5);

    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom1, booking.getBookingRoom());
    }

    @Test
    public void bookingHasNumberOfNights(){
        assertEquals(5, booking.getNumberOfNights());
    }


}

import java.util.ArrayList;

public class ConferenceRoom extends Room {


    private String roomName;

    public ConferenceRoom(int capacity, ArrayList<Guest> guests, String roomName){
        super(capacity, guests);
        this.roomName = roomName;
    }



}
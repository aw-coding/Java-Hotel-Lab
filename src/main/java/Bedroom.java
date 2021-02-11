import java.util.ArrayList;

public class Bedroom extends Room {

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(int capacity, ArrayList<Guest> guests, RoomType roomType, int roomNumber){
        super(capacity, guests);
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public RoomType getRoomType(){
        return this.roomType;
    }





}

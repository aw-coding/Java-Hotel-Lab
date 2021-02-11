import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> guests;


    public Room(int capacity, ArrayList<Guest> guests){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getRoomGuests(){
        return this.guests;
    }
}

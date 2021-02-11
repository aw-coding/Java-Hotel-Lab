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

    public int getGuestsCount(){
        return this.guests.size();
    }

    public int getCapacity(){
        return this.capacity;
    };

    public void addGuest(Guest guest){
        this.guests.add(guest);
    }
}

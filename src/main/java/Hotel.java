import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }


    public int getNumberOfBedrooms(){
        return this.bedrooms.size();
    }

    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.size();
    }


    public void checkInGuestToBedroom(Guest guest, int roomNumberToCheckInto) {
        for (int bedroom = 0; bedroom < bedrooms.size(); bedroom++) {
            if (bedrooms.get(bedroom).getRoomNumber() == roomNumberToCheckInto) {
                bedrooms.get(bedroom).addGuest(guest);
                }
        }
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }



}

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

    public void checkInGuestToConferenceRoom(Guest guest, String roomNameToCheckInto) {
        for (int croom = 0; croom  < conferenceRooms.size(); croom ++) {
            if (conferenceRooms.get(croom ).getRoomName() == roomNameToCheckInto) {
                conferenceRooms.get(croom ).addGuest(guest);
            }
        }
    }

    public void addBedroomToHotel(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoomToHotel(ConferenceRoom conferenceRoom){
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkOutGuestFromBedroom(Guest guest, int roomNumberToCheckOutOf) {
        for (int bedroom = 0; bedroom < bedrooms.size(); bedroom++) {
            if (bedrooms.get(bedroom).getRoomNumber() == roomNumberToCheckOutOf) {
                bedrooms.get(bedroom).removeGuest(guest);
            }
        }
    }

    public void checkOutGuestFromConferenceRoom(Guest guest, String roomNameToCheckOutOf) {
        for (int croom = 0; croom < conferenceRooms.size(); croom++) {
            if (conferenceRooms.get(croom).getRoomName() == roomNameToCheckOutOf) {
                conferenceRooms.get(croom).removeGuest(guest);
            }
        }
    }
}

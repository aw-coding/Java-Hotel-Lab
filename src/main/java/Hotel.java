public class Hotel {

    private Bedroom[] bedrooms;
    private ConferenceRoom[] conferenceRooms;

    public Hotel(int bedrooms, int conferenceRooms){
        this.bedrooms = new Bedroom[bedrooms];
        this.conferenceRooms = new ConferenceRoom[conferenceRooms];
    }


    public int getNumberOfBedrooms(){
        return this.bedrooms.length;
    }

    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.length;
    }


    public void checkInGuestToBedroom(Guest guest, int roomNumberToCheckInto) {
        for (int bedroom = 0; bedroom < bedrooms.length; bedroom++) {
            if (bedrooms[bedroom].getRoomNumber() == roomNumberToCheckInto) {
                    bedrooms[bedroom].getRoomGuests().add(guest);
                }
        }
    }



}

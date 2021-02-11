public class Hotel {

    private Bedroom[] bedrooms;
    private ConferenceRoom[] conferenceRooms;

    public Hotel(){
        this.bedrooms = new Bedroom[8];
        this.conferenceRooms = new ConferenceRoom[3];
    }


    public int getNumberOfBedrooms(){
        return this.bedrooms.length;
    }

    public int getNumberOfConferenceRooms(){
        return this.conferenceRooms.length;
    }
}

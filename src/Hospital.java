import java.util.Arrays;

public class Hospital {

    private String name;
    private Room[] rooms;
    private int numberOfRooms = 10;

    public Hospital() {
        rooms = new Room[numberOfRooms];
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public Room[] getRooms() {
        return rooms;
    }
    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        String roomsString = "";

        for (int i = 0; i < rooms.length; i++) {
            roomsString += rooms[i].toString();
        }

        return "Hospital: " + name + "\nrooms:\n" + roomsString;
    }
}

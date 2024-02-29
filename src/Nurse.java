public class Nurse extends Person{

    private int roomNumber;

    public Nurse( String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", belongs to room number " + this.getRoomNumber();
    }
}

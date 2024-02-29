import java.util.Arrays;

public class Room {

    private int roomNumber;
    private Doctor doctor;
    private Nurse nurse;
    private Patient[] patients;
    private int numberOfPatients = 5;

    public Room() {
        patients = new Patient[numberOfPatients];
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public String toString() {
        String patientsString = "";

        for (int i = 0; i < patients.length; i++) {
            patientsString += patients[i].toString();
        }

        return "Room " +
                "roomNumber=" + roomNumber +
                "\ndoctor=" + doctor +
                "\nnurse=" + nurse +
                "\npatients:" + patientsString +
                ", numberOfPatients=" + numberOfPatients + "\n\n";
    }
}

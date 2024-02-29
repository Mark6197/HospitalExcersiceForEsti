import util.RandomUtil;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();
        hospital.setName("Uni Spital");

        Room[] rooms = new Room[hospital.getNumberOfRooms()];

        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].setRoomNumber(i + 1);
        }

        hospital.setRooms(rooms);

        for (int i = 0; i < hospital.getNumberOfRooms(); i++) {
            int age = RandomUtil.getRandomAge(18, 100);
            Doctor doctor = new Doctor("Doctor" + (i + 1), age, i + 1, RandomUtil.generateRandomDiseaseDescription());
            Patient[] patients = new Patient[5];
            for (int j = 0; j < patients.length; j++) {
                patients[j] = new Patient("Patient" + (j + 1), age);
            }
            Nurse nurse = new Nurse("Nurse" + (i + 1), age, i + 1);
            rooms[i].setDoctor(doctor);
            rooms[i].setPatients(patients);
            rooms[i].setNurse(nurse);
        }

        System.out.println(hospital);

//        for (Room room : hospital.getRooms()) {
//            System.out.println(room);
//        }
    }
}


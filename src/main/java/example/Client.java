package example;

import java.io.*;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TutorialRoom tutorialRoom1 = new TutorialRoom("BTM 010", 4010, "Air Conditional Room", "DKG 4",
                50, 30, "Good", "Not Available");
        TutorialRoom tutorialRoom2 = new TutorialRoom("BTM 011", 4011, "Equipments Room", "DKG 4",
                40, 0, "Good", "Available");
        TutorialRoom tutorialRoom3 = new TutorialRoom("BTM 012", 4012, "Air Conditional Room", "DKG 4",
                50, 45, "Good", "Pending");
        TutorialRoom tutorialRoom4 = new TutorialRoom("BTM 013", 4013, "Smart Classroom", "DKG 4",
                60, 55, "Good", "Not Available");
        TutorialRoom tutorialRoom5 = new TutorialRoom("BTA 011", 6011, "Smart Classroom", "DKG 6",
                60, 0, "Good", "Available");

        ArrayList<TutorialRoom> tutorialRoomList = new ArrayList<TutorialRoom>();
        tutorialRoomList.add(tutorialRoom1);
        tutorialRoomList.add(tutorialRoom2);
        tutorialRoomList.add(tutorialRoom3);
        tutorialRoomList.add(tutorialRoom4);
        tutorialRoomList.add(tutorialRoom5);

        FileOutputStream fos = new FileOutputStream("Client.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tutorialRoomList);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("Client.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        tutorialRoomList = (ArrayList<TutorialRoom>) ois.readObject();

        for (TutorialRoom tutorialRoom : tutorialRoomList) {
            System.out.println(tutorialRoom);
        }

        fis.close();
        ois.close();
    }
}

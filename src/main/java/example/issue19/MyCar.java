package example.issue19;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCar implements MyCar_Interface {
    Scanner scan = new Scanner(System.in);
    String regNo, engineNo, model, color;
    int year;
    ArrayList<Car> carArrayList = new ArrayList<Car>();

    @Override
    public void Menu() {
        System.out.println("1. Add Data");
        System.out.println("2. Display Data");
        System.out.println("3. Delete Data");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice:");
        int choice = 0;
        try {
            choice = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number");
            choice = Integer.parseInt(scan.nextLine());
        }

        switch (choice) {
            case 1:
                addData();
                break;
            case 2:
                displayData();
                break;
            case 3:
                deleteData();
                break;
            case 4:
                System.out.println("Thank you for using our system.");
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid");
                Menu();
                break;
        }
    }

    @Override
    public void addData() {
        System.out.println("Car 1:");
        Input();
        Car car1 = new Car(regNo, engineNo, model, color, year);
        System.out.println("Car 2:");
        Input();
        Car car2 = new Car(regNo, engineNo, model, color, year);
        System.out.println("Car 3:");
        Input();
        Car car3 = new Car(regNo, engineNo, model, color, year);
        carArrayList.add(car1);
        carArrayList.add(car2);
        carArrayList.add(car3);

        Menu();
    }

    @Override
    public void displayData() {
        for (Car myCar : carArrayList) {
            System.out.println(myCar);
        }
        Menu();
    }

    /*
    Delete method is to delete the method that we going to delete.
    The index is calculate from 0
    For example: Car 1 the index is 0
     */
    @Override
    public void deleteData() {
        System.out.println("Please enter the index that want to delete");
        int i = Integer.parseInt(scan.nextLine());
        try {
            carArrayList.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index could not found!");
            deleteData();
        }
        Menu();
    }

    public static void main(String[] args) {
        MyCar_Interface car_interface = new MyCar();
        car_interface.Menu();
    }

    public void Input() {
        System.out.println("Please enter car Registration Number");
        regNo = scan.nextLine();
        System.out.println("Please enter car Engine Number");
        engineNo = scan.nextLine();
        System.out.println("Please enter car Model");
        model = scan.nextLine();
        System.out.println("Please enter car color");
        color = scan.nextLine();
        System.out.println("Please enter car year");
        try {
            year = Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter in number form");
        }
        System.out.println("Data saved.");
    }
}

package example.issue19;

public class Car {
    private String regNo;
    private String engineNo;
    private String model;
    private String color;
    private int year;

    public Car(String regNo, String engineNo, String model, String color, int year) {
        this.regNo = regNo;
        this.engineNo = engineNo;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Registration Number: " + regNo + "\n" + "Engine Number: " + engineNo + "\n"
                + "Model: " + model + "\n" + "Color: " + color + "\n" + "Year: " + year;
    }
}

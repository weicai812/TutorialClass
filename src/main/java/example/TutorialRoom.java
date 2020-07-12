package example;

import java.io.Serializable;

public class TutorialRoom implements Serializable {
    private String roomName;
    private int roomID;
    private String roomDescription;
    private String roomLocation;
    private int maximumCapacity;
    private int currentStudentCapacity;
    private String electricalCondition;
    private String statusofAvailable;

    public TutorialRoom(String roomName, int roomID, String roomDescription, String roomLocation, int maximumCapacity, int currentStudentCapacity, String electricalCondition, String statusofAvailable) {
        this.roomName = roomName;
        this.roomID = roomID;
        this.roomDescription = roomDescription;
        this.roomLocation = roomLocation;
        this.maximumCapacity = maximumCapacity;
        this.currentStudentCapacity = currentStudentCapacity;
        this.electricalCondition = electricalCondition;
        this.statusofAvailable = statusofAvailable;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        this.roomLocation = roomLocation;
    }

    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public int getCurrentStudentCapacity() {
        return currentStudentCapacity;
    }

    public void setCurrentStudentCapacity(int currentStudentCapacity) {
        this.currentStudentCapacity = currentStudentCapacity;
    }

    public String getElectricalCondition() {
        return electricalCondition;
    }

    public void setElectricalCondition(String electricalCondition) {
        this.electricalCondition = electricalCondition;
    }

    public String getStatusofAvailable() {
        return statusofAvailable;
    }

    public void setStatusofAvailable(String statusofAvailable) {
        this.statusofAvailable = statusofAvailable;
    }

    @Override
    public String toString() {
        return "Room Name: " + roomName + ", " + "Room ID: " + roomID + ", " + "Room Description: " + roomDescription +
                ", " + "Room Location: " + roomLocation + ", " + "Maximum Capacity: " + maximumCapacity + ", " +
                "Current Student Capacity: " + currentStudentCapacity + ", " + "Electrical Condition: " + electricalCondition +
                ", " + "Status of Available: " + statusofAvailable;
    }
}

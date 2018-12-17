package HomeWork2;

public class CarDoor {
    private static boolean stateOfDoor;
    private static boolean stateOfWindows;

    public CarDoor() {
        stateOfDoor = false;
        stateOfWindows = false;
    }

    public CarDoor(boolean stateOfDoor, boolean stateOfWindows) {
        this.stateOfDoor = stateOfDoor;
        this.stateOfWindows = stateOfWindows;
    }

    public void openTheDoor() {
        stateOfDoor = true;
    }

    public void closeTheDoor() {
        stateOfDoor = false;
    }

    public void openCloseDoor() {
        stateOfDoor = !stateOfDoor;
    }

    public void openTheWindow() {
        stateOfWindows = true;
    }

    public void closeTheWindow() {
        stateOfDoor = false;
    }

    public void openCloseWindows() {
        stateOfWindows = !stateOfWindows;
    }

    public void showState() {
        System.out.println("State of doors : " + stateOfDoor);
        System.out.println("State of windows : " + stateOfWindows);
    }
}


package HomeWork2;

import java.util.Arrays;
import java.util.Date;

public class Car {
    private Date dateOfMade;
    private TypeEngine typePower;
    private static int maxSpeed;
    private int chargeTime;
    private int maxPass;
    private int currentPass;
    private static int currentSpeed;
    private CarWheel[] arrOfWheels;
    private CarDoor[] arrOfDoors;

    public Car(Date dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public Car(TypeEngine typePower, int maxSpeed, int chargeTime, int maxPass, int currentPass, int currentSpeed) {
        this.typePower = typePower;
        this.maxSpeed = maxSpeed;
        this.chargeTime = chargeTime;
        this.maxPass = maxPass;
        this.currentPass = currentPass;
        this.currentSpeed = currentSpeed;
    }

    public void setArrOfWheels(CarWheel[] arrOfWheels) {
        this.arrOfWheels = arrOfWheels;
    }

    public void setArrOfDoors(CarDoor[] arrOfDoors) {
        this.arrOfDoors = arrOfDoors;
    }

    public boolean changeSpeed(int speed) {
        if (speed <= maxSpeed) {
            currentSpeed = speed;
            return true;
        }
        return false;
    }

    public void addPass() {
        if (currentPass < maxPass) {
            currentPass++;
        }
    }

    public void outPass() {
        currentPass--;
    }

    public void removePass() {
        currentPass = 0;
    }

    public CarDoor getDoorIndex(int doorIndex) {
        if (doorIndex < 0 || doorIndex >= arrOfDoors.length) {
            return null;
        }
        return arrOfDoors[doorIndex];
    }

    public CarWheel getWheelIndex(int wheelIndex) {
        if (wheelIndex < 0 || wheelIndex >= arrOfWheels.length) {
            return null;
        }
        return arrOfWheels[wheelIndex];
    }

    public CarWheel[] removeAllWheels() {
        return arrOfWheels = null;
    }

    @Override
    public String toString() {
        return "Car{" +
                "dateOfMade=" + dateOfMade +
                ", typePower=" + typePower +
                ", chargeTime=" + chargeTime +
                ", maxPass=" + maxPass +
                ", currentPass=" + currentPass +
                ", arrOfWheels=" + Arrays.toString(arrOfWheels) +
                ", arrOfDoors=" + Arrays.toString(arrOfDoors) +
                '}';
    }
}

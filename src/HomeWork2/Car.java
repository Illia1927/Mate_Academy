package HomeWork2;

import java.util.Arrays;
import java.util.Date;

public class Car {
    private final double MAX_WHEEL_STATE = 1.0;
    private final double MIN_WHEEL_STATE = 0.0;
    private Date dateOfMade;
    private TypeEngine typePower;
    private static int maxSpeed;
    private int chargeTime;
    private int maxPass;
    private int currentPass;
    private int currentSpeed;
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

    public double getFastestPossibleSpeed() {
        double maxWheelState = MAX_WHEEL_STATE;
        double minWheelState = MIN_WHEEL_STATE;
        if (currentPass < 0) {
            System.out.println("The are no pass in your car!");
            return 0;
        }
        for (int i = 0; i < arrOfWheels.length; i++) {
            if (arrOfWheels[i].getWheelState() < minWheelState) {
                System.out.println("You iptuted incorrect data");
            } else if (arrOfWheels[i].getWheelState() < maxWheelState) {
                maxWheelState = arrOfWheels[i].getWheelState();
            }
        }
        return maxSpeed * maxWheelState;
    }

    public void addAnotherWheel(int numOfWheels) {
        CarWheel[] addWheel = new CarWheel[arrOfWheels.length + numOfWheels];
        if (numOfWheels < 0) {
            System.out.println("You iptuted incorrect data");
        } else {
            if (arrOfWheels.length != 0) {
                for (int i = 0; i < arrOfWheels.length; i++) {
                    if (addWheel[i] == null) {
                        addWheel[i] = new CarWheel();
                    }else {
                        addWheel[i] = arrOfWheels[i];
                    }
                }
            }
        }
        arrOfWheels = addWheel;
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

package HomeWork2;

public class CarWheel {
    private static final double MAX_STATE_OF_WHEEL = 1.0;
    private double stateOfWheel;

    public CarWheel() {
        stateOfWheel = MAX_STATE_OF_WHEEL;
    }

    public CarWheel(double stateOfWheel) {
        this.stateOfWheel = stateOfWheel;
    }

    public void changeWheel() {
        stateOfWheel = MAX_STATE_OF_WHEEL;
    }

    public void useTire(double wearRate) {
        double tireWear = wearRate / 100;
        if (stateOfWheel > tireWear) {
            stateOfWheel = stateOfWheel - tireWear;
        } else {
            stateOfWheel = 0;
        }
    }

    public double getWheelState() {
        return stateOfWheel;
    }

    public void showState() {
        System.out.println("State of wheel is : " + (stateOfWheel * 100) + "%");
    }
}


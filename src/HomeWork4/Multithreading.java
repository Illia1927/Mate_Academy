package HomeWork4;

public class Multithreading extends Thread {
    long sleepMillis;
    String name;

    public Multithreading(String name, long sleepMillis) {
        super(name);
        this.sleepMillis = sleepMillis;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(sleepMillis);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException was occurred in " + name);
        }
        System.out.println(name + " finished");
    }
}

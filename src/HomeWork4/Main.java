package HomeWork4;

public class Main {
    public static void main(String[] args) {
        Multithreading multithreading = new Multithreading("First", 3000);
        Multithreading multithreadingSecond = new Multithreading("Second", 5000);
        multithreading.run();
        multithreadingSecond.run();
        System.out.println("main metod finished");

    }
}

package HomeWork4;

public class Main2 {
    public static void main(String[] args) {
        Multithreading multithreading = new Multithreading("First", 3000);
        Multithreading multithreadingSecond = new Multithreading("Second", 5000);
        multithreading.start();
        try {
            multithreading.join(500);
            System.out.println(multithreading.getName() + " Join exit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        multithreadingSecond.start();
        System.out.println("main method finished");
    }
}

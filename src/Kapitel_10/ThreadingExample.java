package Kapitel_10;

public class ThreadingExample implements Runnable {
    private int count = 0;

    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " gestartet");
        while (count < 5) {
            System.out.println("Thread " + Thread.currentThread().getName() + " zählt " + (++count));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread " + Thread.currentThread().getName() + " unterbrochen");
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " beendet");
    }

    public static void main(String[] args) {
        System.out.println("Hauptthread gestartet");
        ThreadingExample instance = new ThreadingExample();
        Thread thread = new Thread(instance);
        thread.start();
        while (instance.count != 5) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("Hauptthread unterbrochen");
            }
        }
        System.out.println("Hauptthread beendet");
    }
}

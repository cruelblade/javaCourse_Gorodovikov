import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new ThreadInt(), "new Thread");
        Thread t2 = new Thread(new ThreadInt(), "new Thread2");
        Thread t3 = new Thread(() -> {
            for (int i = 10; i>=0; i--) {
                System.out.println(i);
            }
        }, "new Thread3");
        System.out.println("before");
        t.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);
        System.out.println("after");

    }

}

class ThreadTest extends Thread {
    public ThreadTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                for (int i = 0; i <= 10; i++) {
                    System.out.println("Thread: " + getName() + " = " + i);
                    sleep(300);
                    if (getName().equals("new Thread2") && i == 3) {
                        throw new ArithmeticException();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadInt implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i<=10; i++) {
            System.out.println("Thread: " + Thread.currentThread());
        }
    }
}
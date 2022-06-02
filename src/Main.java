import java.time.LocalTime;
import java.util.*;

public class Main {
    static LocalTime localTime = LocalTime.now().plusSeconds(30);

    public static void main(String[] args){

        Thread cars = new Thread(new ThreadCars(), "threadCars");
        Thread person = new Thread(new ThreadPersons(), "threadPersons");

        cars.start();
        person.start();
    }
}

class ThreadPersons extends Thread {
    Road road = new Road();

    @Override
    public void run() {
        int i = 0;
        try {
            while (LocalTime.now().isBefore(Main.localTime)) {
                i++;
                System.out.println(i + "-й человек");
                road.countPersons();
                Thread.sleep(2000);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

class ThreadCars extends Thread {
    Road road = new Road();

    @Override
    public void run() {
        int i = 0;
        try {
            while (LocalTime.now().isBefore(Main.localTime)) {
                i++;
                System.out.println(i + "-я машина");
                road.countCars();
                Thread.sleep(5000);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }


}

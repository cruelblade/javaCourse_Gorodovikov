import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Printable inst = name -> System.out.println("Hello, " + name);
        inst.print("MAX");

        Filter af = age -> !(age < 18);

        Scanner scr = new Scanner(System.in);
        int age = scr.nextInt();



    }
}

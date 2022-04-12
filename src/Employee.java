public class Employee extends Person implements Printable, SeasonHandler {
    @Override
    public void pay() {
        System.out.println("Не указана сумма выплаты");
    }
}
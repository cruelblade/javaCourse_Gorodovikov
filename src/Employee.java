public class Employee extends Person implements Printable, SeasonHandler {

    public void pay() {
        System.out.println("Не указана сумма выплаты");
    }

    @Override
    public void print(String name) {
        System.out.println("Имя сотрудника " + name);
    }
}
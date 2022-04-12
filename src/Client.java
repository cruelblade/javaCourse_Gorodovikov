public class Client extends Person implements Printable, SeasonHandler {

    public void pay() {
        System.out.println("Клиентам не выплачивается сумма");
    }

    @Override
    public void print(String name) {
        System.out.println("Имя клиента " + name);
    }
}

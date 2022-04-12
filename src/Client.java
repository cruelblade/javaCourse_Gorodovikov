public class Client extends Person implements Printable, SeasonHandler {
    @Override
    public void pay() {
        System.out.println("Клиентам не выплачивается сумма");
    }
}

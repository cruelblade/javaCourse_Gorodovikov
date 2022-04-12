public abstract class Person implements Printable, SeasonHandler{

    private String str = "Строка";

    public String getStr() {
        return str;
    }

    public void pay(int sum) {
        System.out.println("Выплаченная сумма " + sum);
    }
}

public class Documentation <T extends Recordable<T>>  {

    T firstDoc;
    String mainDoc;


    public Documentation(T firstDoc) {
        this.firstDoc = firstDoc;
    }
    public Documentation() {
        this.mainDoc = "Стандартная документация";
    }

    public String printDoc(T printed) {
        return printed.toString();
    }

}

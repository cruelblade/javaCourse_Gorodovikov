public class Documentation <T extends Recordable<?>>  {

    T firstDoc;
    String mainDoc = "Стандартная документация";


    public Documentation(T firstDoc) {
        this.firstDoc = firstDoc;
    }
    public Documentation() {}

    public T getFirstDoc() {
        return firstDoc;
    }

    public void setFirstDoc(T firstDoc) {
        this.firstDoc = firstDoc;
    }

    public void printDoc(T printed) {
        System.out.println(printed.toString());
    }

    @Override
    public String toString() {
        return "Documentation{" +
                "firstDoc=" + firstDoc +
                ", mainDoc='" + mainDoc + '\'' +
                '}';
    }
}

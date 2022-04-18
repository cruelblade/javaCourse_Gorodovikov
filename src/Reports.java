public class Reports<T> implements Recordable<T>{
    T report;

    public Reports(T report) {
        this.report = report;
    }

    public T getReport() {
        return report;
    }

    @Override
    public String record(T recorded) {
        return recorded.toString();
    }
}

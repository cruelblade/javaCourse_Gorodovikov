public class Analytics <T> implements Recordable<T>{
    T firstAnalytics;

    public Analytics(T firstAnalytics) {
        this.firstAnalytics = firstAnalytics;
    }

    public T getFirstAnalytics() {
        return firstAnalytics;
    }

    @Override
    public String record(T recorded) {
        return recorded.toString();
    }

    public T printAnalytics() {
        return this.firstAnalytics;
    }

    @Override
    public String toString() {
        return "Analytics{" +
                "firstAnalytics=" + firstAnalytics +
                '}';
    }
}

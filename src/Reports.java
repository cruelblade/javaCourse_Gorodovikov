import java.util.Objects;

public class Reports<T> implements Recordable<T>, Cloneable {
    T report;

    public Reports(T report) {
        this.report = report;
    }

    public T getReport() {
        return report;
    }

    public void setReport(T report) {
        this.report = report;
    }

    @Override
    public String record(T recorded) {
        return recorded.toString();
    }

    @Override
    public String toString() {
        return "Reports{" +
                "report=" + report +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reports<?> reports = (Reports<?>) o;
        return report.equals(reports.report);
    }

    @Override
    public int hashCode() {
        return 17 * (report.hashCode() + 1);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

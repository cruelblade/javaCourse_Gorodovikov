public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        //передача в аргументы классов разных видов generic (String и Integer)
        Analytics <Integer> analytics = new Analytics<>(7);
        System.out.println(analytics.printAnalytics());
        Analytics <String> analyticsNewPart = new Analytics<>("Рефинансирование");
        System.out.println(analyticsNewPart.printAnalytics());
        Reports<String> reports  = new Reports<>("Отчет о тестировании");
        System.out.println();

        //передача в аргумент класса Documentation объектов классов, реализующих интерфейс Recordable
        Documentation<Analytics<Integer>> analyticsDocumentation = new Documentation<>();
        analyticsDocumentation.setFirstDoc(analytics);
        System.out.println(analyticsDocumentation);

        Documentation<Reports<String>> reportsDocumentation = new Documentation<>();
        reportsDocumentation.setFirstDoc(reports);
        System.out.println(reportsDocumentation.toString());
        System.out.println();


        //проверка переопределения методов Object в классе Reports
        //проверка переопределенного метода toString() произведена в предыдущем примере

        //переопределение equals()
        Reports<String> reports1 = new Reports<>("Отчет о тестировании");
        System.out.println(reports);
        System.out.println(reports1);
        System.out.println("Равенство отчетов: " + reports.equals(reports1));
        System.out.println();

        //переопределение hashCode()
        System.out.println(reports.hashCode());
        System.out.println(reports1.hashCode());
        System.out.println();

        //проверка getClass.getName()
        System.out.println(reports.getClass().getName());
        System.out.println();

        //переопределение clone()
        Reports<String> reports2 = (Reports<String>) reports.clone();
        System.out.println(reports);
        System.out.println(reports2);
        reports2.setReport("Отчет о безопасности");
        System.out.println(reports);
        System.out.println(reports2);

    }
}

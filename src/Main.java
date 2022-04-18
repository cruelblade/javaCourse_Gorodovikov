public class Main {

    public static void main(String[] args) {

        Analytics <Integer> analytics = new Analytics<>(7);
        System.out.println(analytics.printAnalytics());
        Analytics <String> analyticsNewPart = new Analytics<>("Рефинансирование");
        System.out.println(analyticsNewPart.printAnalytics());

        Recordable<Integer> recAnalytics = analytics;
        System.out.println(recAnalytics.record(analytics.getFirstAnalytics()));


        Reports<String> reports  = new Reports<>("Отчет о безопасности");
        Recordable<String> recReport = reports;
        System.out.println();

//        Recordable<Analytics<Integer>> an = new Documentation<>();
    }
}

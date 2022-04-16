public class Main {

    public static void main(String[] args) {
//        Documentation<Integer> docs = new Documentation();
//        Recordable<Integer> recs = docs.mainDoc;
//        docs.Record(recs);

        Analytics <Integer> analytics = new Analytics<>(11);
        System.out.println(analytics.printAnalytics());
        Analytics <String> analyticsNewPart = new Analytics<>("Рефинансирование");
        System.out.println(analyticsNewPart.printAnalytics());
    }
}

import java.util.function.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Ты прозаик, я поэт...\n");
        sb.insert(0, "Ты  я очень беден;\n");
        sb.insert(3, "богат");
        System.out.println(sb);


        String text = """
                Телефон: +79991234567
                email: huge@mail.ru
                Данный сотрудник - ввел генератор разных идей и развлечений""";

        Pattern p = Pattern.compile("\\+\\d{11}");



        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group());
        }

    }

}
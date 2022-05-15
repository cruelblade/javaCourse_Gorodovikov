import java.util.ArrayList;
import java.util.function.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        //вывод стиха со StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Ты прозаик, я поэт...\n");
        sb.insert(0, "Ты  я очень беден;\n");
        sb.insert(3, "богат");
        System.out.println(sb);


        String text = """
                Телефон: +79991234567
                e-mail: huge@mail.ru
                Данный сотрудник - ввел генератор разных идей и развлечений.""";

        //вывод телефона по маске
        Pattern p = Pattern.compile("\\+7\\d{10}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            String phoneNumber = m.group().replaceFirst(m.group().substring(3,10), "******");
            text = text.replaceFirst(p.toString(), phoneNumber);
        }

        //скрытие email
        p = Pattern.compile("\\w+@\\w+\\.\\w+");
        m = p.matcher(text);

        while (m.find()) {
            text = text.replaceFirst(p.toString(), "*email скрыт*");
        }

        //вывод слов > 5 символов
        String[] splitWords = text.split(" ");

        for (String s : splitWords) {
            if (s.length() <= 5 & !s.matches("[?!:;,)(.\"'-]")) {
                s = s.replaceFirst(s,"");
            }
            if (!s.equals("")) {
                System.out.print(s + " ");
            }
        }


    }

}
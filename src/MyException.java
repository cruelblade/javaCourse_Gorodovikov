import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyException extends Exception{

    public MyException (String message){
        super(message);
    }

    public static void inputCheck() throws MyException {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Pattern invalidExpression = Pattern.compile("([а-я]|[А-Я]|\\w)\\1\\1|\\d");
        Matcher matcher = invalidExpression.matcher(input);
        String exceptionOutput = "";

        if (input.matches(".*([а-я]|[А-Я]|\\w)\\1\\1.*|.*\\d.*")) {
            while(matcher.find())
                exceptionOutput = exceptionOutput + " " + matcher.group().charAt(0);
            throw new MyException("Недопустимый ввод:" + exceptionOutput);
        } else if (input.equals("")){
            System.out.println("Вы не ввели строку");
        } else {
            System.out.printf("В строке \"%s\" нет букв, повторяющихся 3 раза подряд и цифр\n", input);
        }
    }
}

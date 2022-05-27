import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        try (FileReader r = new FileReader(
                "C:\\Users\\Professional\\Desktop\\Прочее\\javaProjects\\javaCourse_Gorodovikov\\src\\test.txt");
            FileWriter w = new FileWriter(
                    "C:\\Users\\Professional\\Desktop\\Прочее\\javaProjects\\javaCourse_Gorodovikov\\src\\testNew.txt"))
        {
            StringBuilder text = new StringBuilder();
            int letter;
            while ((letter = r.read()) != -1) {
                text.append((char) letter);
            }
            TextRedactor textRedactor = new TextRedactor(text.toString());
            w.write(textRedactor.returnText());
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }


}
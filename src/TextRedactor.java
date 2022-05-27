import java.util.*;

public class TextRedactor {
    String text;
    List<String> bigWords = new ArrayList<>();

    public TextRedactor(String text) {
        this.text = text.replaceAll("[^A-Za-zА-Яа-я0-9 \n]", "").toLowerCase();
        String[] words = this.text.split("[ \n]");
        for (String word : words) {
            if (word.length() > 6)
                bigWords.add(word);
        }
    }

    public String returnText() {
        String outputText = text + "\n\nИзмененный текст:\n";
        for(String bigWord : bigWords) {
            outputText += bigWord + " ";
        }
        return outputText;
    }
}

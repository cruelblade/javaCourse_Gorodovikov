

public class Notes {

    String noteName;
    String noteBody;
    String noteType;
    int noteNumber;
    String noteAuthor;

    public Notes(String noteName, String noteBody, String noteType, int noteNumber, String noteAuthor) {
        this.noteName = noteName;
        this.noteBody = noteBody;
        this.noteType = noteType;
        this.noteNumber = noteNumber;
        this.noteAuthor = noteAuthor;
    }

    public String getNoteName() {
        return noteName;
    }

    public String getNoteBody() {
        return noteBody;
    }

    public String getNoteType() {
        return noteType;
    }

    public int getNoteNumber() {
        return noteNumber;
    }

    public String getNoteAuthor() {
        return noteAuthor;
    }

    @Override
    public String toString() {
        return  "Заметка № " + noteNumber +
                "\nНазвание заметки: '" + noteName + '\'' +
                "\nТекст заметки: '" + noteBody + '\'' +
                "\nТип заметки: '" + noteType + '\'' + '\n';
    }
}

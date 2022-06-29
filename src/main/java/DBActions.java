import java.sql.*;

public class DBActions {
    public static Connection conn;
    static
    {
        try {
            conn = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/java_ee_db",
                    "postgres", "postgres");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void createNote(String noteName, String noteBody, String noteType, int noteNumber, String noteAuthor) {
        try {
            Statement stmt = conn.createStatement();

            String sqlQuery = "INSERT INTO notes VALUES ('" +
                    noteName + "', '" + noteBody + "', '" + noteType + "', '" + noteNumber + "', '" + noteAuthor + "')";
            stmt.executeUpdate(sqlQuery);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static int returnLastId() {
        Integer result = null;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT max(id) from notes");
            while (rs.next())
                result = rs.getInt(1);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }

    public static Notes[] searchNotes(String searchInput) {
        Notes[] notes = new Notes[10];
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from notes where \"noteType\" like '%" + searchInput + "%' or \"noteName\" like '%" + searchInput + "%'");

            for (int i = 0; rs.next(); i++) {
                String noteName = rs.getString(1);
                String noteBody = rs.getString(2);
                String noteType = rs.getString(3);
                int noteNumber = rs.getInt(6);
                String noteAuthor = rs.getString(5);

                notes[i] = new Notes(noteName, noteBody, noteType, noteNumber, noteAuthor);

            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return notes;
    }

    public static int sumNotes() {
        int sum = 0;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from notes");

            while (rs.next()) {
                sum++;
            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sum;
    }

}

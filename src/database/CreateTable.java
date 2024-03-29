package database;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class CreateTable {
 
    /**
     * Create a new table in the test database
     *
     * @param table
     */
    public static void createNewTable(String table) {
   
        // SQL statement for creating a new table
        String sql = "CREATE TABLE IF NOT EXISTS "+table+" (\n"
                + "	id integer PRIMARY KEY,\n"
                + "	name text NOT NULL,\n"
                + "	cpf text NOT NULL UNIQUE,\n"
                + "	sexo text NOT NULL,\n"
                + "	tel text NOT NULL,\n"
                + "	nasc text NOT NULL,\n"
                + "	telegram text NOT NULL,\n"
                + "	endereco text NOT NULL,\n"
                + "	obs text \n"
                + ");";
        try (Connection conn = DriverManager.getConnection(olguinha.Olguinha.URL);
                Statement stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
 
}
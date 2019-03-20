package database;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
/**
 *
 * @author sqlitetutorial.net
 */
public class InsertDB {
 
    /**
     * Connect to the test.db database
     *
     * @return the Connection object
     */
    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(olguinha.Olguinha.URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
 
    /**
     * Insert a new row into the warehouses table
     *
     * @param name
     * @param capacity
     */
    public void insert(String name, String cpf, String sexo, String tel, String nasc, String telegram, String endereco, String obs) {
        String sql = "INSERT INTO "+ olguinha.Olguinha.TABLE + " (name,cpf,sexo,nasc,tel,telegram,endereco,obs) VALUES(?,?,?,?,?,?,?,?)";
 
        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(2, cpf.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(3, sexo.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(4, nasc.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(5, tel.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(6, telegram.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(7, endereco.toLowerCase().replaceAll("\\s",""));
            pstmt.setString(8, obs.toLowerCase().replaceAll("\\s",""));
                                                                                    
            pstmt.executeUpdate();
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
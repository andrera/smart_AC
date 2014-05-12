/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.ac;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author andre
 */
public class Database {
    private String dbuser = "root";
    private String dpasswd = "";
    private Statement stmt = null;
    private Connection conn = null;
    private ResultSet rs = null;

    public Database() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/smartac", dbuser, dpasswd);
            stmt = conn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

  
}

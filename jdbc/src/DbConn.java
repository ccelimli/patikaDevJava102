import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
    public static final String DB_URL="jdbc:mysql://localhost:3306/patika?user=root&password=12345";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="12345";

    public static void main(String[] args) {
        Connection connection=null;
        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}

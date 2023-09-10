import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public static void main(String[] args) {
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/patika?user=root&password=12345";
        try {
            connection= DriverManager.getConnection(url);
        }catch (SQLException error){
            System.out.println(error.getMessage());
        }
    }
}

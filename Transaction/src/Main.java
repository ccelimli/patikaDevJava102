import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static final String DB_URL="jdbc:mysql://localhost:3306/patika?user=root&password=12345";
    public static final String DB_USER="root";
    public static final String DB_PASSWORD="12345";

    public static void main(String[] args) {
        Connection connection=null;
        try {
            connection= DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement=connection.prepareStatement("INSERT INTO student (student_name,student_class) VALUES (?,?)");
            preparedStatement.setString(1,"8.Ogrenci");
            preparedStatement.setInt(2,7);
            preparedStatement.executeUpdate();

            if (true){
                throw new SQLException();
            }
            connection.commit();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            if (connection!=null){
                try {
                    connection.rollback();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
            throw new RuntimeException(e.getMessage());
        }
    }
}
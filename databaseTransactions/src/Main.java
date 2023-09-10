import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/patika";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "12345";

    public static void main(String[] args) {
        Connection connection = null;
        String sql = "SELECT * FROM student";
//        String insertSql="INSERT INTO student (student_name,student_class) VALUES ('6. Ogrenci', 6)";
        String preparedStatementInsertSql = "INSERT INTO student (student_name,student_class) VALUES (?, ?)";
        String statementUpdateSql = "UPDATE student SET student_name='8. Ogrenci' WHERE student_id=8 ";
        String preparedStatementUpdateSql = "UPDATE student SET student_class=? WHERE student_id=?";

        String deleteSql = "DELETE FROM student WHERE student_id=9";
        String deletePrSql = "DELETE FROM student WHERE student_id=?";
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //statement.executeUpdate(insertSql);
            //statement.executeUpdate(statementUpdateSql);
            statement.executeUpdate(deleteSql);

            //PreparedStatement preparedStatement=connection.prepareStatement(preparedStatementInsertSql);
            //preparedStatement.setString(1,"7. Ogrenci");
            //preparedStatement.setInt(2,7);
            //preparedStatement.executeUpdate();

//            PreparedStatement preparedStatement = connection.prepareStatement(preparedStatementUpdateSql);
//            preparedStatement.setInt(1, 8);
//            preparedStatement.setInt(2, 8);
//            preparedStatement.executeUpdate();

            PreparedStatement preparedStatement = connection.prepareStatement(deletePrSql);
            preparedStatement.setInt(1,8);
            preparedStatement.executeUpdate();
            preparedStatement.close();


            ResultSet data = statement.executeQuery(sql);
            while (data.next()) {
                System.out.println("Id: " + data.getInt("student_id"));
                System.out.println("Adı:: " + data.getString("student_name"));
                System.out.println("Sınıfı: " + data.getInt("student_class"));
                System.out.println("##############");
            }

            connection.close();
            statement.close();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
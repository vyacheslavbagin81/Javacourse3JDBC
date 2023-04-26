import java.sql.*;

public class Application {
    public static void main(String[] args) {

        final String user = "postgres";
        final String password = "postgres";
        final String url = "jdbc:postgresql://localhost:5432/skypro";
        try (final Connection connection =
                     DriverManager.getConnection(url, user, password);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee FULL JOIN citi ON employee.citi_id = citi.citi_id")) {

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                if (id == 4) {
                    String first_name = resultSet.getString("first_name");
                    String last_name = resultSet.getString("last_name");
                    String gender = resultSet.getString("gender");
                    String citi_name = resultSet.getString("citi_name");

                    System.out.println("ФИО: " + first_name + " " + last_name);
                    System.out.println("пол: " + gender);
                    System.out.println("город проживания: " + citi_name);
                    break;
                }
            }

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных!");
            e.printStackTrace();
        }
    }
}

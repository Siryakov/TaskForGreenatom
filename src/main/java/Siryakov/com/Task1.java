package Siryakov.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Task1 { // SQL запрос

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/Task1?user=root&password=15Siryakov122001"; //подколючение к моей БД для тестов

        try (Connection connection = DriverManager.getConnection(jdbcUrl)) {
            // SQL-запрос
            String SQLrequest = "SELECT surname " +
                    "FROM pm_schema.test " +
                    "WHERE experience = (SELECT DISTINCT experience " +
                    "FROM pm_schema.test " +
                    "ORDER BY experience DESC " +
                    "LIMIT 1 OFFSET 1) " +
                    "LIMIT 1";

            try (PreparedStatement preparedStatement = connection.prepareStatement(SQLrequest);
                 ResultSet resultSet = preparedStatement.executeQuery()) {

                if (resultSet.next()) {
                    String surname = resultSet.getString("surname");
                    System.out.println("Сотрудник со вторым по старшинству опытом: " + surname);
                } else {
                    System.out.println("Данные не найдены.");
                }
            }
        } catch (SQLException e) { //Ловим ошибку подключения к бд или выполнении SQL-запроса
            e.printStackTrace();
        }
    }
}

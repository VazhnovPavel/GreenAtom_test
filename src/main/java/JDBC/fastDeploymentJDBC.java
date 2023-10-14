package JDBC;

import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Простой пример быстрого развертывания JDBC драйвера на основе HikariCP
 */


public class fastDeploymentJDBC {
    public static void main(String[] args) {
        HikariDataSource dataSource = HikariCPConfig.createDataSource();

        try (Connection connection = dataSource.getConnection()) {
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT * FROM sportsman";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()) {
                long sportsmanId= resultSet.getLong("sportsman_id");
                String sportsmanName= resultSet.getString("sportsman_name");
                System.out.println("sportsman_id = " + sportsmanId + " sportsman_name = "+
                        sportsmanName );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

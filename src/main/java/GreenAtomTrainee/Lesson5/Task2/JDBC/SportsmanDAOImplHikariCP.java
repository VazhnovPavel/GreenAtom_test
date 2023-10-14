package GreenAtomTrainee.Lesson5.Task2.JDBC;

import GreenAtomTrainee.Lesson5.Task2.JDBC.Sportsman;
import GreenAtomTrainee.Lesson5.Task2.JDBC.SportsmanDAO;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SportsmanDAOImplHikariCP implements SportsmanDAO {
    //Создаём экземпляр HikariDataSource
    private HikariDataSource dataSource;
    //Создаём конструктор
    public SportsmanDAOImplHikariCP(HikariDataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Sportsman> getAllSportsman() {
        List<Sportsman> sportsmanList = new ArrayList<>();
        //Вызываем коннекшен, создаём sql запрос
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM sportsman");
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Sportsman sportsman = new Sportsman();
                sportsman.setSportsmanID(resultSet.getInt("sportsman_id"));
                sportsman.setSportsmanName(resultSet.getString("sportsman_name"));
                sportsman.setRank(resultSet.getInt("rank"));
                sportsman.setDateOfBirth(resultSet.getInt("year_of_birth"));
                sportsman.setPersonal_record(resultSet.getInt("personal_record"));
                sportsman.setCountry(resultSet.getString("country"));

                sportsmanList.add(sportsman);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sportsmanList;
    }

    @Override
    public Sportsman getSportsman(int sportsmanNum) {
        Sportsman sportsman = null;
        //Вызываем коннекшен, создаём sql запрос
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM sportsman " +
                     "WHERE sportsman_id = ?")) {
            statement.setInt(1, sportsmanNum);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    sportsman = new Sportsman();
                    sportsman.setSportsmanID(resultSet.getInt("sportsman_id"));
                    sportsman.setSportsmanName(resultSet.getString("sportsman_name"));
                    sportsman.setRank(resultSet.getInt("rank"));
                    sportsman.setDateOfBirth(resultSet.getInt("year_of_birth"));
                    sportsman.setPersonal_record(resultSet.getInt("personal_record"));
                    sportsman.setCountry(resultSet.getString("country"));
                    // Заполните остальные поля
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sportsman;
    }

    @Override
    public void updateSportsman(Sportsman sportsmanUpdate) {
        //Вызываем коннекшен, создаём sql запрос
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("UPDATE sportsman SET sportsman_name = ? " +
                     "WHERE sportsman_id = ?")) {
            statement.setString(1, sportsmanUpdate.getSportsmanName());
            statement.setLong(2, sportsmanUpdate.getSportsmanID());
            statement.executeUpdate();
            System.out.println("Sportsman: SportsmanID " + sportsmanUpdate.getSportsmanID() + ", updated in the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteSportsman(Sportsman sportsmanToDelete) {
        //Вызываем коннекшен, создаём sql запрос
        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE FROM sportsman WHERE sportsman_id = ?")) {
            statement.setLong(1, sportsmanToDelete.getSportsmanID());
            statement.executeUpdate();
            System.out.println("Sportsman: SportsmanID " + sportsmanToDelete.getSportsmanID() + ", deleted from the database");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Sportsman> sortingAndPagination(int pageNumber, int pageSize) {
        List<Sportsman> sportsmanList = new ArrayList<>();

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement("SELECT * FROM sportsman ORDER BY sportsman_name LIMIT ? OFFSET ?")) {
            // Рассчитываем значения для LIMIT и OFFSET на основе номера страницы и размера страницы
            int limit = pageSize;
            int offset = (pageNumber - 1) * pageSize;

            statement.setInt(1, limit);
            statement.setInt(2, offset);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Sportsman sportsman = new Sportsman();
                    sportsman.setSportsmanID(resultSet.getInt("sportsman_id"));
                    sportsman.setSportsmanName(resultSet.getString("sportsman_name"));
                    sportsman.setRank(resultSet.getInt("rank"));
                    sportsman.setDateOfBirth(resultSet.getInt("year_of_birth"));
                    sportsman.setPersonal_record(resultSet.getInt("personal_record"));
                    sportsman.setCountry(resultSet.getString("country"));
                    // Заполните остальные поля
                    sportsmanList.add(sportsman);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sportsmanList;
    }

}

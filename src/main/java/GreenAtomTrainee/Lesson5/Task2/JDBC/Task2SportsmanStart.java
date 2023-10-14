package GreenAtomTrainee.Lesson5.Task2.JDBC;


import GreenAtomTrainee.Lesson5.Task2.JDBC.Sportsman;
import GreenAtomTrainee.Lesson5.Task2.JDBC.SportsmanDAO;
import GreenAtomTrainee.Lesson5.Task2.JDBC.SportsmanImplList;
import JDBC.HikariCPConfig;
import com.zaxxer.hikari.HikariDataSource;


public class Task2SportsmanStart {

    public static void main(String[] args) {

        // Создаём экземпляр HikariCPConfig и получаем HikariDataSource
        HikariCPConfig hikariCPConfig = new HikariCPConfig();
        HikariDataSource dataSource = hikariCPConfig.createDataSource();

        // Создаём экземпляр SportsmanDAO на основе SportsmanDAOImplHikariCP
        SportsmanDAO sportsmanDAO = new SportsmanDAOImplHikariCP(dataSource);

        // Выводим все данные о спортсменах
        System.out.println("Выводим все данные о спортсменах: ");
        for (Sportsman sportsman : sportsmanDAO.getAllSportsman()) {
            System.out.println("Sportsman: [SportsmanID : " + sportsman.getSportsmanID() + ", Name : "
                    + sportsman.getSportsmanName() + " ]");
        }

        // Обновляем спортсмена
        Sportsman sportsmanToUpdate = sportsmanDAO.getAllSportsman().get(0);
        System.out.println("\nПереименовываем спортсмена: ");
        sportsmanToUpdate.setSportsmanName("Clark");
        sportsmanDAO.updateSportsman(sportsmanToUpdate);

        // Получаем спортсмена и выводим его данные
        Sportsman sportsman = sportsmanDAO.getSportsman(1);
        System.out.println("Sportsman: [SportsmanID : " + sportsman.getSportsmanID() + ", Name : "
                + sportsman.getSportsmanName() + " ]");

        // Сортируем в алфавитном порядке список спортсменов и пагинируем по 4 спортсменов
        System.out.println("\nНачинаем сортировку и пагинацию: ");
        for (Sportsman sportsmanSort: sportsmanDAO.sortingAndPagination(1,5)) {
            System.out.println("Sportsman: [SportsmanID : " + sportsmanSort.getSportsmanID() + ", Name : "
                    + sportsmanSort.getSportsmanName() + " ]");
        }

        //Удаляем спортсмена (если нужно)
        System.out.println("\n Удаление спортсмена: ");
        Sportsman sportsman1 = sportsmanDAO.getSportsman(8);
                sportsmanDAO.deleteSportsman(sportsman1);
        System.out.println("Sportsman: [SportsmanID : " + sportsman1.getSportsmanID() + ", Name : "
                + sportsman1.getSportsmanName() + " ]");
    }



}


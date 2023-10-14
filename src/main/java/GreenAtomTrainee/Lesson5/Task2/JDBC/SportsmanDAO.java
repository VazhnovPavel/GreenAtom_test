package GreenAtomTrainee.Lesson5.Task2.JDBC;

import GreenAtomTrainee.Lesson5.Task2.JDBC.Sportsman;

import java.util.List;

public interface SportsmanDAO {

    public List<Sportsman> getAllSportsman();
    public Sportsman getSportsman(int sportsmanNum);
    public void updateSportsman(Sportsman sportsman);
    public void deleteSportsman(Sportsman sportsman);
    public List<Sportsman> sortingAndPagination(int pageNumber, int pageSize);
}

package GreenAtomTrainee.Lesson5.Task2.JDBC;

import GreenAtomTrainee.Lesson5.Task2.JDBC.Sportsman;
import GreenAtomTrainee.Lesson5.Task2.JDBC.SportsmanDAO;

import java.util.ArrayList;
import java.util.List;

public class SportsmanImplList implements SportsmanDAO {

    List<Sportsman> sportsman;
    public SportsmanImplList(){

        sportsman = new ArrayList<Sportsman>();

        Sportsman sportsman1 = new Sportsman(1,"Pavel",2,85,
                1994,"Russia");

        Sportsman sportsman2 = new Sportsman(2,"Nastya",3,86,
                1995,"Ukranian");

        sportsman.add(sportsman1);

        sportsman.add(sportsman2);

    }

    @Override
    public List<Sportsman> getAllSportsman() {
        return sportsman;
    }

    @Override
    public Sportsman getSportsman(int sportsmanNum) {

        return sportsman.get(sportsmanNum);
    }

    @Override
    public void updateSportsman(Sportsman sportsmanUpdate) {

        sportsman.get((int) sportsmanUpdate.getSportsmanID()).setSportsmanName(sportsmanUpdate.getSportsmanName());
        System.out.println("Sportsman: SportsmanID " + sportsmanUpdate.getSportsmanID() + ", updated in the database");
    }

    @Override
    public void deleteSportsman(Sportsman sportsmanToDelete) {
        sportsman.remove(sportsmanToDelete);
        System.out.println("Sportsman: SportsmanID " + sportsmanToDelete.getSportsmanID() + ", deleted from the database");
    }

    @Override
    public List<Sportsman> sortingAndPagination(int pageNumber, int pageSize) {
        return null;
    }

}

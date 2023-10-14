package GreenAtomTrainee.Lesson5.Task2.JDBC;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Sportsman {

    private int sportsmanID;
    private String sportsmanName;
    private int rank;
    private int personal_record;
    private int dateOfBirth;
    private String country;

    public Sportsman(int sportsmanID, String sportsmanName, int rank, int personal_record, int dateOfBirth, String country) {
        this.sportsmanID = sportsmanID;
        this.sportsmanName = sportsmanName;
        this.rank = rank;
        this.personal_record = personal_record;
        this.dateOfBirth = dateOfBirth;
        this.country = country;
    }

}

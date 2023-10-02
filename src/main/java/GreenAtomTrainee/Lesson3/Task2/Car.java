package GreenAtomTrainee.Lesson3.Task2;

import lombok.Getter;

import java.io.Serializable;

public class Car implements Serializable {

    @Getter
    private  String nameCar;
    @Getter
    private  int yearOfIssue;


    public Car(String nameCar,int yearOfIssue) {
        this.nameCar = nameCar;
        this.yearOfIssue = yearOfIssue;

    }
}

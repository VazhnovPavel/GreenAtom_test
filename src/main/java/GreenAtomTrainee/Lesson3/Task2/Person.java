package GreenAtomTrainee.Lesson3.Task2;

import lombok.Getter;

import java.io.Serializable;

public class Person implements Serializable {
    @Getter
    private String name;
    @Getter
    private int age;
    @Getter
    transient String activity;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setActivity(int age) {
        if (this.age <= 3) {
            activity= "Сидит дома";
        } else if (this.age <= 7) {
            activity= "Ходит в детский сад";
        } else if (this.age <= 18) {
            activity= "Учится в школе";
        } else if (this.age <= 23) {
            activity= "Учится в институте";
        } else if (this.age <= 65) {
            activity= "Работает";
        } else {
            activity= "На пенсии";
        }
    }
}

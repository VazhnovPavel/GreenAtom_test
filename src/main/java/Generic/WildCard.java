package Generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));


        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);

        //Полиморфизм работать не будет, поэтому в методе test
        // мы будем использовать Wildcard
        test(listOfDog);

    }

    //Wildcard <? extends Animal> позволяет нам работать либо с Animal объектами,
    //либо с его наследниками

    //Wildcard List<? super Animal> позволила бы работать только с Animal и объектами выше
    //например, object
    private static void test(List<? extends Animal> list){
        for(Animal animal: list){
            animal.eat();

        }

    }
}

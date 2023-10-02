package Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vazhnov Pavel
 */
public class StartTheme {
    public static void main(String[] args) {
        ////////////////Java 5/////////////////
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(3);
        System.out.println(animal);
        ///////////////Java 6//////////////////
        List<String> animals2 = new ArrayList<String>();
        animals2.add("Cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);
        System.out.println(animal2);
        ///////////////Java 7//////////////////
        List<String> animals3 = new ArrayList<>();
        animals3.add("Cat");
        animals3.add("dog");
        animals3.add("frog");
        String animal3 = animals3.get(1);
        System.out.println(animal3);


    }

}

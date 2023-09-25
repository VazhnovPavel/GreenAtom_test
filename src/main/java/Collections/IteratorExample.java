package Collections;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public void iteratorForExample() {
        boolean someCondition = false;

        List<String> myList = new java.util.ArrayList<>();
        Iterator<String> iterator = myList.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();

            if (someCondition) {
                iterator.remove(); // Безопасное удаление элемента
            }
        }
    }
}

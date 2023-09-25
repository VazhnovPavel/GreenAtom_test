package Collections.Sorting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayListSort {

        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("cherry");
            list.add("banana");


            // Сортировка списка
            Collections.sort(list);

            // Вывод отсортированного списка
            System.out.println(list); // Выводит "[apple, banana, cherry]"
        }

}

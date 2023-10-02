package GreenAtomTrainee.Lesson2;
import java.util.*;
import java.util.ArrayList;

public class SpeedTest {
    public static void main(String[] args) {
        final int N = 1000000; // Размер коллекции
        int elementToSearch = N / 2; // Элмент поиска в коллекции
        int elementToAdd = N + 1; // Элемент, который нужно добавить

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        int[] array = new int[N];


        // Измерение времени добавления элемента в ArrayList
        long startTime = System.nanoTime();
        arrayList.add(N + 1);
        long endTime = System.nanoTime();
        long addArrayListTime = endTime - startTime;

        // Измерение времени добавления элемента в LinkedList
        startTime = System.nanoTime();
        linkedList.add(N + 1);
        endTime = System.nanoTime();
        long addLinkedListTime = endTime - startTime;

        // Измерение времени добавления элемента в TreeSet
        startTime = System.nanoTime();
        treeSet.add(elementToAdd);
        endTime = System.nanoTime();
        long addTreeSetTime = endTime - startTime;

        // Измерение времени добавления элемента в HashSet
        startTime = System.nanoTime();
        hashSet.add(elementToAdd);
        endTime = System.nanoTime();
        long addHashSetTime = endTime - startTime;

        // Измерение времени добавления элемента в массив
        startTime = System.nanoTime();
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elementToAdd;
        endTime = System.nanoTime();
        long addArrayTime = endTime - startTime;

        // Измерение времени поиска элемента в ArrayList
        startTime = System.nanoTime();
        boolean arrayListContains = arrayList.contains(elementToSearch);
        endTime = System.nanoTime();
        long searchArrayListTime = endTime - startTime;

        // Измерение времени поиска элемента в LinkedList
        startTime = System.nanoTime();
        boolean linkedListContains = linkedList.contains(elementToSearch);
        endTime = System.nanoTime();
        long searchLinkedListTime = endTime - startTime;

        // Измерение времени поиска элемента в TreeSet
        startTime = System.nanoTime();
        treeSet.contains(N + 1);
        endTime = System.nanoTime();
        long searchTreeSetTime = endTime - startTime;

        // Измерение времени поиска элемента в HashSet
        startTime = System.nanoTime();
        hashSet.contains(N + 1);
        endTime = System.nanoTime();
        long searchHashSetTime = endTime - startTime;

        // Измерение времени поиска элемента в массиве
        startTime = System.nanoTime();
        boolean arrayContains = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToSearch) {
                arrayContains = true;
                break;
            }
        }
        endTime = System.nanoTime();
        long searchArrayTime = endTime - startTime;



        // Измерение времени удаления элемента из ArrayList
        startTime = System.nanoTime();
        arrayList.remove(Integer.valueOf(N + 1));
        endTime = System.nanoTime();
        long removeArrayListTime = endTime - startTime;

        // Измерение времени удаления элемента из LinkedList
        startTime = System.nanoTime();
        linkedList.remove(Integer.valueOf(N + 1));
        endTime = System.nanoTime();
        long removeLinkedListTime = endTime - startTime;

        // Измерение времени удаления элемента из TreeSet
        startTime = System.nanoTime();
        treeSet.remove(elementToSearch);
        endTime = System.nanoTime();
        long removeTreeSetTime = endTime - startTime;

        // Измерение времени удаления элемента из HashSet
        startTime = System.nanoTime();
        hashSet.remove(elementToSearch);
        endTime = System.nanoTime();
        long removeHashSetTime = endTime - startTime;

        // Измерение времени удаление элемента из массива
        startTime = System.nanoTime();
        array = Arrays.copyOf(array, array.length + 1);
        array[elementToSearch] =0;
        endTime = System.nanoTime();
        long removeArrayTime = endTime - startTime;


        // Вывод результатов
        System.out.println("Время добавления элемента в ArrayList:  " + addArrayListTime + " наносекунд");
        System.out.println("Время добавления элемента в LinkedList: " + addLinkedListTime + " наносекунд");
        System.out.println("Время добавления элемента в TreeSet:    " + addTreeSetTime + " наносекунд");
        System.out.println("Время добавления элемента в HashSet:    " + addHashSetTime + " наносекунд");
        System.out.println("Время добавления элемента в массив:     " + addArrayTime + " наносекунд \n");


        System.out.println("Время поиска элемента в ArrayList:      " + searchArrayListTime + " наносекунд");
        System.out.println("Время поиска элемента в LinkedList:     " + searchLinkedListTime + " наносекунд");
        System.out.println("Время поиска элемента в TreeSet:        " + searchTreeSetTime + " наносекунд");
        System.out.println("Время поиска элемента в HashSet:        " + searchHashSetTime + " наносекунд");
        System.out.println("Время поиска элемента в массиве:        " + searchArrayTime + " наносекунд\n");

        System.out.println("Время удаления элемента из ArrayList:   " + removeArrayListTime + " наносекунд");
        System.out.println("Время удаления элемента из LinkedList:  " + removeLinkedListTime + " наносекунд");
        System.out.println("Время удаления элемента из TreeSet:     " + removeTreeSetTime + " наносекунд");
        System.out.println("Время удаления элемента из HashSet:     " + removeHashSetTime + " наносекунд");
        System.out.println("Время удаления элемента из массива:     " + removeArrayTime + " наносекунд");




    }
}


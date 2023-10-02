package GreenAtomTrainee.GreenAtomStartExam;

public class Number2 {

    /**
     *      Просто передать даные мы не можем, так как примитивные типы передаются в методы по значению
     *      В задаче сказано, что мы не можем использовать сторонние переменные, но не сказано про другие типы,
     *      например, массивы. Если наш реверс необходимо провести только в методе, то можно обойтись без массива
     */


public static void main(String[] args) {
    int a = 2;
    int b = 8;
    int[] arr = {a, b};

    System.out.println("Изначальное значение а = " + arr[0]);
    System.out.println("Изначальное значение b = " + arr[1]);

    swap(arr);

    System.out.println("Конечное значение а = " + arr[0]);
    System.out.println("Конечное значение b = " + arr[1]);
}
    public static void swap(int[] arr) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
    }
}

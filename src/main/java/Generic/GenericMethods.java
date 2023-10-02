package Generic;
public class GenericMethods {
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"Пипи", "Пупу"};

        GenericMethods genericMethods = new GenericMethods();

        //Работает только со ссылочным типом, поэтому используем обёртку Integer
        Integer firstElementA = genericMethods.getFirstElement(a);
        System.out.println("Первый элемент массива a: " + firstElementA);


        String firstElementB = genericMethods.getFirstElement(b);
        System.out.println("Первый элемент массива b: " + firstElementB);
    }

    public <T> T getFirstElement(T[] array) {
        if (array != null && array.length > 0) {
            return array[0];
        } else {
            return null;
        }
    }
}


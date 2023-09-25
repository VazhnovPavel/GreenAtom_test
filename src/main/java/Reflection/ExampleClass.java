package Reflection;

public class ExampleClass {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        //Создаём объект класса через рефлексию
        Class<?> myClass = Class.forName("Reflection.ExampleClass");
        Object obj = myClass.newInstance();
        System.out.println(myClass);
    }

}

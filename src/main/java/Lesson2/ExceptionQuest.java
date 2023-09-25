package Lesson2;

public class ExceptionQuest {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try {
                new MyException();
            } catch (Throwable e) {
                System.out.println("e = " + e);
                // Если исходная причина ошибки совпадает с ошибкой MyException, то...
                if (e.getCause() instanceof MyException) {
                    //Приводим e.getCause() к MyException ex
                    MyException ex = (MyException) e.getCause();
                    //Извлекаем значение строки s
                    System.out.println("e instanceof " + ExceptionArray.class.getName() + ", s = " + ex.get());
                }
            }
        }
    }
}

    class MyException extends RuntimeException {
    private String s;

//        Во второй итерации цикла происходит попытка создать еще один объект класса MyException,
//        но при этом уже не выполняется статический блок инициализации класса MyException, так как класс уже был
//        загружен в память, и его статический блок уже был выполнен. Вместо этого возникает
//        java.lang.NoClassDefFoundError, так как класс MyException не может быть повторно загружен.
    static {
        init();
    }

    public MyException() {
        s = "Hello";
    }

    private static void init() {
        //оборачивается в ExceptionInInitializerError
        throw new MyException();
    }

    public String get() {
        return s;
    }
}


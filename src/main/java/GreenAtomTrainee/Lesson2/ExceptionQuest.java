package GreenAtomTrainee.Lesson2;

public class ExceptionQuest {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
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

//        статический блок инициализации работает один раз
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


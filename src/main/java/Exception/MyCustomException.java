package Exception;

// Создаем пользовательское исключение подклассом Exception
public class MyCustomException extends Exception {
    // Конструктор без параметров
    public MyCustomException() {
        super();
    }

    // Конструктор с сообщением
    public MyCustomException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

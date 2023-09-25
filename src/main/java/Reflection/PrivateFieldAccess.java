package Reflection;
import java.lang.reflect.Field;
public class PrivateFieldAccess {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Создаем экземпляр класса с приватным полем
        MyClass myObject = new MyClass();

        // Получаем класс объекта
        Class<?> myClass = myObject.getClass();

        try {
            // Получаем доступ к приватному полю "privateField"
            Field privateField = myClass.getDeclaredField("privateField");

            // Разрешаем доступ к приватному полю
            privateField.setAccessible(true);

            // Чтение значения приватного поля
            int fieldValue = (int) privateField.get(myObject);
            System.out.println("Значение privateField: " + fieldValue);

            // Изменение значения приватного поля
            privateField.set(myObject, 42);
            System.out.println("Новое значение privateField: " + myObject.getPrivateField());
        } catch (NoSuchFieldException e) {
            System.out.println("Приватное поле не найдено.");
        } catch (IllegalAccessException e) {
            System.out.println("Нет доступа к приватному полю.");
        }
    }
}

class MyClass {
    private int privateField = 10;

    public int getPrivateField() {
        return privateField;
    }
}

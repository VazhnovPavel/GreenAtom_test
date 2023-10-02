package GreenAtomTrainee.Lesson3.Task2;

import java.lang.reflect.Field;

public class PrintObject {
    public void print(Object o) {

        Class<?> superClass = o.getClass();

        // Получаем все поля класса, включая приватные
        Field[] fields = superClass.getDeclaredFields();

        for (Field field : fields) {
            // Разрешаем доступ к приватным полям
            field.setAccessible(true);
            String fieldName = field.getName();
            Object fieldValue = null;
            try {
                fieldValue = field.get(o);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(fieldName + ": " + fieldValue);
        }
        System.out.println();
    }
}

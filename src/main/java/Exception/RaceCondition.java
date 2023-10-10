package Exception;

/**
 * Пример RaceCondition, когда из за гонки потоков получаем непредсказуемый результат
 */

public class RaceCondition {
    private static int counter = 0;

    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 100000; i++) {
                counter++; // Несинхронизированное обновление общей переменной
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Результат: " + counter); // Результат может быть непредсказуемым
    }
}


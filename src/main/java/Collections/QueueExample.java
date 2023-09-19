package Collections;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {



        public static void main(String[] args) {
            // Создаем очередь с использованием LinkedList
            Queue<String> queue = new LinkedList<>();

            // Добавляем элементы в очередь
            queue.offer("Task 1");
            queue.offer("Task 2");
            queue.offer("Task 3");

            // Извлекаем и обрабатываем элементы в порядке FIFO
            while (!queue.isEmpty()) {
                String task = queue.poll();
                System.out.println("Processing: " + task);
            }
        }
    }



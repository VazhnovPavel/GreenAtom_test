package Stream;

import java.util.concurrent.RecursiveTask;

public class ForkJoinPool extends RecursiveTask<Integer> {
    private int start;
    private int end;

    public ForkJoinPool(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 100) {
            // Выполняем вычисление для небольшой задачи
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        } else {
            // Разделяем задачу на подзадачи и выполняем их параллельно
            int middle = (start + end) / 2;
            ForkJoinPool leftTask = new ForkJoinPool(start, middle);
            ForkJoinPool rightTask = new ForkJoinPool(middle + 1, end);
            leftTask.fork();
            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();
            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        java.util.concurrent.ForkJoinPool pool = new java.util.concurrent.ForkJoinPool();
        ForkJoinPool task = new ForkJoinPool(1, 1000);
        int result = pool.invoke(task);
        System.out.println("Result: " + result);
    }
}

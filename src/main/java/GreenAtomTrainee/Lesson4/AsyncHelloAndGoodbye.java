package GreenAtomTrainee.Lesson4;

public class AsyncHelloAndGoodbye extends Thread {
    public void run() {
        try {
            System.out.println("Асинхронный привет!");
            Thread.sleep(5000);
            System.out.println("Асинхронный пока!");
            System.exit(1);
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " +e);
        }
    }


}

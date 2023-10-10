package GreenAtomTrainee.Lesson4;

import com.sun.security.jgss.GSSUtil;

public class AsyncWorkProgramCheck implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Работает основная программа");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка: " +e);
        }
    }


}

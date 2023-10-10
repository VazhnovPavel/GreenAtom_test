package GreenAtomTrainee.Lesson4;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
       AsyncHelloAndGoodbye asyncHelloAndGoodbye = new AsyncHelloAndGoodbye();
       AsyncWorkProgramCheck asyncWorkProgramCheck = new AsyncWorkProgramCheck();
       Thread thread = new Thread(asyncWorkProgramCheck);

       thread.start();
       asyncHelloAndGoodbye.run();
    }
}

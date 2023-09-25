package Exception;

public class ExceptionExample {


    public static void main(String[] args) {
        int a =5;
        int b = 0;
        try {
            if (a + b == 5){
                throw new MyCustomException("Число не увеличилось");
            }
        }
        catch (MyCustomException e){
            //System.out.println("Поймано пользовательское исключение: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

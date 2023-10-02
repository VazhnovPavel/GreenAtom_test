package Lambda;

public class MyLambda {



    public static void main(String[] args) {

        Increment inc = new Increment() {
            @Override
            public int inc(int a) {
                return a++;
            }
        };

        Increment inc1 = (int a) -> a;
        System.out.println(inc1);
    }



    @FunctionalInterface
    public interface Increment{
        public int inc (int a);
    }
}

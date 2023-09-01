package standard_class;

public class SystemApp {
    public static void main(String[] args) {


        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        //System.out.println(System.getenv("USER"));

        System.gc();

        System.exit(1);

        System.out.println("Hi");



    }
}

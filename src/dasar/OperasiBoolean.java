package dasar;

public class OperasiBoolean {

    public static void main(String[] args) {

        int a = 100;
        int b = 200;
        boolean c = a < 10 && b < 500;
        System.out.println(!c);

        System.out.println();


        System.out.println(a < 10 && b <500); // False && True       -> False
        System.out.println(a > 10 && b >500); // True && False       -> False
        System.out.println(a <= 10 && b <=500); // False && True     -> False
        System.out.println(a >= 10 && b >= 500); // True && False    -> False
        System.out.println(a == 10 && b == 500); //False && False    -> False
        System.out.println(a < 500 && b < 500);

        System.out.println();

        System.out.println(a < 10 || b <500);  // False || True       -> True
        System.out.println(a > 10 || b >500); // True || False        -> True
        System.out.println(a <= 10 || b <=500); // False || True      -> True
        System.out.println(a >= 10 || b >= 500); // True || False     -> True
        System.out.println(a == 10 || b == 500); //False || False     -> False




    }
}

package dasar;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(forLoopRecursive(7));
        System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7);

        System.out.println(recursiveMethod(7));
    }


    static int forLoopRecursive(int value){
        int result = 1;

        for (int i = 1; i <= value; i++){
            result*= i;
        }

        return result;

    }

    static int recursiveMethod(int value){
        if (value == 1){
            return 1;
        }
        return value * recursiveMethod(value-1);
    }


}

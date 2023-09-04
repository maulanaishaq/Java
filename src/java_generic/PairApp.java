package java_generic;

public class PairApp {
    public static void main(String[] args) {


        Pair<String, Integer> pair = new Pair<>("maulana", 300);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());



    }
}

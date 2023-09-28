package java_collection;


import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {

        Map<Integer,Integer> app = new WeakHashMap<>();

        for (int i = 1; i <= 1_000_000; i ++){
            app.put(i, i);
        }

        System.gc();

        System.out.println(app.size());


    }
}

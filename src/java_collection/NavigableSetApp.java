package java_collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("maulana","budi","joko","jojo"));

        NavigableSet<String> desc = names.descendingSet();

        NavigableSet<String> joko = names.headSet("jojo", true);


        for (var name : joko){
            System.out.println(name);
        }




    }
}

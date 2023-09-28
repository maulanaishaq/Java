package java_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {


        List<String> strings = new ArrayList<>();
       // List<String> stringList = new LinkedList<>();

        strings.add("Maulana");
        strings.add("Ishaq");

        strings.set(1, "Budi");
        strings.remove(0);

        System.out.println(strings.get(0));

        for (var value : strings){
            System.out.println(value);
        }



    }
}

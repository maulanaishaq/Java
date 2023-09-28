package java_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();
        collection.add("maulana");
        collection.add("ishaq");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));


        for (String value : collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("ishaq");
        collection.removeAll(List.of("Zaman","Now"));

        for (String value : collection){
            System.out.println(value);
        }

        System.out.println(collection.contains("maulana"));
        System.out.println(collection.containsAll(List.of("Programmer", "Now"))); // dicek semua



    }
}

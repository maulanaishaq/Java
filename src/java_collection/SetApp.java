package java_collection;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {


       //Set<String> names = new HashSet<>(); Data tidak boleh double & tidak terurut
        Set<String> names = new LinkedHashSet<>(); //Data tidak boleh double & tidak terurut

        names.add("Asep");
        names.add("Joko");
        names.add("Banu");
        names.add("Aji");
        names.add("Joko");
        names.add("Banu");


        for (var value : names){
            System.out.println(value);
        }


    }
}

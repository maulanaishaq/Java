package java_collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        // otomatis akan diurutkan oleh comparator -> asc
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("maulana"));
        people.add(new Person("Budi"));
        people.add(new Person("Aji"));

        for (var person : people){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("Joko"));



    }
}

package java_collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> singleton = Collections.singleton("Maulana");

        Set<String> mutable = new HashSet<>();
        mutable.add("budi");
        mutable.add("joko");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("jaja", "kurniawan");
        //set.add("Mega");  ERROR
       // set.remove("jaja");  ERROR



    }
}

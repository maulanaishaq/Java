package java_collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapApp {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("firstname", "maulana");
        map.put("middlename", "ishaq");
        map.put("lastname", "fadillah");


        System.out.println(map.get("firstname"));
        System.out.println(map.get("middlename"));
        System.out.println(map.get("lastname"));



    }
}

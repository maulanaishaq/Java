package standard_class;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {


        StringJoiner joiner = new StringJoiner(",", "[" , "]");
        joiner.add("Maulana");
        joiner.add("Ishaq");

        String value = joiner.toString();
        System.out.println(value);


    }
}

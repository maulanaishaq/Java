package standard_class;

public class NumberApp {

    public static void main(String[] args) {

        Integer intValue = 10;


        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();


        String contoh = "10000";

        Integer convert = Integer.valueOf(contoh);
        System.out.println(convert);




    }


}

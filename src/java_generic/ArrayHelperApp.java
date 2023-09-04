package java_generic;

import java.lang.reflect.AnnotatedArrayType;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Maulana" , "Ishaq"};

        Integer[] numbers = {1,2,3,4,5,6,7,8};


        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(numbers));





    }
}

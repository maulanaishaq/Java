package java_generic;

import jdk.swing.interop.SwingInterOpUtils;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Maulana");
        MyData<Integer> integerMyData = new MyData<>(120);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);



    }
}

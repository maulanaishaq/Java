package java_generic;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
        process(stringMyData);

    }


    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());

        //myData.setData(1); Hanya bisa read only, karena berbahaya merubah tipe data yg tadinya string menjadi integer


    }





}

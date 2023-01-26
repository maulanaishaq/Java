package dasar;

public class Method {
    public static void main(String[] args) {

        Method method = new Method();
        method.methodVoidNonParam();
        System.out.println(method.methodStringNonParam());

        System.out.println();

        methodStaticNonParam();
        System.out.println(methodStaticStringNonParam());


        setName("Maulana");
        System.out.println(setNameString("Budi"));

        System.out.println();

        penjumlahan(100,200);
        System.out.println(perkalian(20,100));

        System.out.println();

        int nilai[] = {10,20,30,100};
        System.out.println(penjumlahanArray(nilai));


    }

    // Non Static Method
    void methodVoidNonParam(){
        System.out.println("Method void non param");
    }

    String methodStringNonParam(){
        return "Method String non param";
    }


    // Static Method
    static void methodStaticNonParam(){
        System.out.println("Method Static Void Non Param");
    }

    static String methodStaticStringNonParam(){
        return "Method static String Non Param";
    }


    static void setName(String name){
        System.out.println("Nama saya adalah" + name);
    }

    static String setNameString(String name){
        return "Name saya adalah " +name;
    }

    public static void penjumlahan (int angka1, int angka2){
        int total = angka1+angka2;
        System.out.println(total);
    }

    public static int perkalian(int angka1, int angka2){
        int total = angka1*angka2;
        return total;
    }

    public static int penjumlahanArray(int angka []){
        int total = 0;

        for (int i = 0; i<= angka.length-1; i++){
            total+=angka[i];
        }

        int rata = total / angka.length;

        return rata;

    }


}

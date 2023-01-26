package dasar;

public class TipeDataArray {
    public static void main(String[] args) {

        int nilai[];
        nilai = new int[3];
        nilai[0] = 10;
        nilai[1] = 20;
        nilai[2] = 30;

        for (int values : nilai){
            System.out.println("Cetak Nilai "+values);
        }

        System.out.println();


        int total = 3;
        int harga [] = new int[total];
        harga[0] = 1000;
        harga[1] = 2000;
        harga[2] = 4000;

        for (int values : harga){
            System.out.println("Cetak Harga "+values);
        }

        System.out.println();


        int a[] = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 40;

        for (int values : a){
            System.out.println("Cetak a "+ values);
        }

        System.out.println();


        int b[] = new int[]{2, 4, 5, 6, 7};
        for (int values : b){
            System.out.println("Cetak b "+ values);
        }

        System.out.println();



        int angka[] = {1, 2, 3, 4, 5};
        for (int values : angka){
            System.out.println("Cetak Angka "+ values);
        }



    }
}

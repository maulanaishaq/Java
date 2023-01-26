package dasar;

public class IfStatement {
    public static void main(String[] args) {

        int nilaiKkmUjian = 70;
        int nilaiKkmAbsen = 65;

        int nilaiAkuUjian = 75;
        int nilaiAkuAbsen = 70;


        if (nilaiAkuUjian >= nilaiKkmUjian && nilaiAkuAbsen >= nilaiKkmAbsen){
            System.out.println("Selamat and Lulus KKM Ujian & Absennya bagus");
        }else {
            System.out.println("Anda tidak lulus");
        }

        System.out.println();

        if (nilaiAkuUjian >= nilaiKkmUjian){
            if (nilaiAkuAbsen >= nilaiKkmAbsen){
                System.out.println("Anda lulus keduanya");
            }else {
                System.out.println("Anda tidak lulus absen");
            }
        }else {
            System.out.println("Anda tidak lulus di keduanya");
        }


    }
}

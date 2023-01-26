package dasar;

public class SwitchStatement {
    public static void main(String[] args) {

        int nilaiKKMUjian = 70;
        int nilaiKKMAbsen = 70;

        int nilaiAkuUjian = 50;
        int nilaiAkuAbsen = 90;

        boolean lulus = nilaiAkuUjian >= nilaiKKMUjian && nilaiAkuAbsen >= nilaiKKMAbsen;
        System.out.println(lulus);


        String ternary = nilaiAkuUjian >= nilaiKKMUjian && nilaiAkuAbsen >= nilaiKKMAbsen? "Anda lulus contoh ternaty" : "Coba lagi ye";
        System.out.println(ternary);


        String ternaryOperator = nilaiAkuUjian >= nilaiKKMUjian ? "Anda lulus" : "Silahkan coba lagi";
        System.out.println(ternaryOperator);


        char grade = 'B';

        switch (grade){
            case 'A':
                System.out.println("Grade anda A");
                break;
            case 'B':
                System.out.println("Grade anda B");
                break;
            case 'C':
                System.out.println("Grade anda C");
            case 'D':
                System.out.println("Grade anda D");
                break;
            default:
                System.out.println("Anda tidak lulus");

        }




    }
}

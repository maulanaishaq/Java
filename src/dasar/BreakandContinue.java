package dasar;

public class BreakandContinue {
    public static void main(String[] args) {

        int counter = 10;
        int count = 1;

        for (int i = 1; i <= counter; i++){
            System.out.println(i);

            if (i == 5){
                break;
            }
        }
        System.out.println("Perulangan For Loop Berhenti");


        while (true){
            System.out.println(count);
            count++;
            if (count == 10){
                break;
            }

        }

        System.out.println("Perulangan While Loop Berhenti");


        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.println("Bilangan Ganjil "+ i);

        }




    }
}

package standard_class;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++){


            Random random = new Random();

            int value = random.nextInt(1000);

            System.out.println(value);




        }




    }
}

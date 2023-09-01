package standard_class;

import javax.sound.midi.Soundbank;

public class StringBuilderApp {
    public static void main(String[] args) {

       StringBuilder builder = new StringBuilder();

       builder.append("Maulana");
       builder.append(" ");
       builder.append("Ishaq");

       String name = builder.toString();

       System.out.println(name);





    }
}

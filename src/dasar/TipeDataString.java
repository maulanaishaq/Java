package dasar;

public class TipeDataString {

    public static void main(String[] args) {

        String firstName = "Maulana";
        String lastName = "Ishaq";


        String a = firstName.toLowerCase();
        String b = firstName.toUpperCase();
        String c = firstName.concat(lastName);
        String d = firstName.substring(3);
        String e = firstName.substring(3,6);
        String f = firstName.trim();
        String g = String.valueOf(firstName.charAt(4));
        String h = String.valueOf(firstName.length());
        String i = String.valueOf(firstName.compareTo(lastName)); //
        String j = String.valueOf(firstName.equals(lastName));
        String k = String.valueOf(firstName.isEmpty());
        //String l = firstName.split();
        //String m = firstName.split();
        String n = String.valueOf(firstName.startsWith("M"));
        String o = String.valueOf(firstName.toCharArray());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
       // System.out.println(l);
        //System.out.println(m);
        System.out.println(n);
        System.out.println(o);


    }
}

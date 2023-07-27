package oop;

public class AbstractApp {
    public static void main(String[] args) {

      //  var Location = new Location(); Kelas abstract tidak bisa dibuat object harus dari class turunannya

        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.radius);

        System.out.println(city.name);

        Location location = new City();
        location.name = "Depok";
        location.run();



    }
}

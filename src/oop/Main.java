package oop;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setMerk("Daihatsu");
        car.setColor("Merah");
        car.setType("Sedan");
        car.setJenisKendaraan("Darat");
        car.setRoda(4);

        System.out.println(car.getMerk());
        System.out.println(car.getColor());
        System.out.println(car.getType());
        System.out.println(car.getJenisKendaraan());
        System.out.println(car.getRoda());

        System.out.println();

        Train train = new Train("Class Ekonomi");
        train.setJenisKendaraan("Darat");
        train.setRoda(180);
        System.out.println(train.getJenisKendaraan());
        System.out.println(train.getRoda());
        System.out.println(train.getClassKereta());

        System.out.println();

        Plane plane = new Plane("Eksekutif");
        plane.setJenisKendaraan("Kendaraan Udara");
        plane.setRoda(8);
        plane.setClassPesawat("Premium");

        System.out.println(plane.getClassPesawat());
        System.out.println(plane.getJenisKendaraan());
        System.out.println(plane.getRoda());


    }
}

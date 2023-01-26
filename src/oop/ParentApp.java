package oop;

public class ParentApp {
    public static void main(String[] args) {

        Child child = new Child();
        child.name = "maulana";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt(); // outputnya yg child karena pakai objek child
        System.out.println(parent.name); // Kalo variable independent tetap akses classnya



    }
}

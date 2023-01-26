package oop;

public class VicePresident  extends Manager{


    VicePresident(String name){
        super(name); // Untuk akses constuctor parent, kalo ada parameternya di class child wajib dibuat
    }


    void sayHello(String name){
        System.out.println("Hi "+ name + " Hello my name is VP " + this.name);
    }


}

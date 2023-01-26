package oop;

public class PolymorphismApp {
    public static void main(String[] args) {


        Employee employee = new Employee("maulana"); // Yg bisa di polymorphism harus dari class parentnya, jadi class child hanya initiate begitu juga implement dari param method
        employee.sayHello("budi");

        employee = new Manager("maulana");
        employee.sayHello("budi");


        employee = new VicePresident("maulana");
        employee.sayHello("budi");

        sayHello(new Employee("jojo"));
        sayHello(new Manager("jojo"));
        sayHello(new VicePresident("jojo"));


        Manager m = new Manager("paul");
        m.sayHello("deni");

        m = new VicePresident("paul");
        m.sayHello("deddy");


    }

    static void sayHello(Employee employee){
        System.out.println("Hello my name is "+ employee.name);
    }


}

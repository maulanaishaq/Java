package oop;

public class Plane extends Kendaraaan {

    String classPesawat;


    public Plane(String classPesawat){
        this.classPesawat = classPesawat;
    }


    public void setClassPesawat(String classPesawat){
        System.out.println("Class pesawat anda adalah " + classPesawat + " Seri Class Pesawat "+ this.classPesawat);
    }

    public String getClassPesawat(){
        return classPesawat;
    }


}

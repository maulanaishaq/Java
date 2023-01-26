package oop;

public class Train extends Kendaraaan {

    private String classKereta;


    public Train(String classKereta){
        this.classKereta = classKereta;
    }

    public void setClassKereta(String classKereta){
        this.classKereta = classKereta;
    }

    public String getClassKereta(){
        return classKereta;
    }



}

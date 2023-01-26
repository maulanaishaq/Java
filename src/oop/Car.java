package oop;

public class Car extends Kendaraaan {
    private String merk;
    private String color;
    private String type;

    public Car(String merk, String color, String type){
        this.merk = merk;
        this.color = color;
        this.type = type;
    }

    public Car(String merk, String color){
        this(merk, color, null);
    }


    public Car(String merk){
            this(merk, null);
    }

    public Car(){
        this(null);
    }


    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getMerk(){
        return merk;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }


}

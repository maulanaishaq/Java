package oop;

public class Kendaraaan {

    private int roda;
    private String jenisKendaraan;

    public Kendaraaan(){

    }

    public Kendaraaan(int roda, String jenisKendaraan){
        this.roda = roda;
        this.jenisKendaraan = jenisKendaraan;
    }


    public void setRoda(int roda){
        this.roda = roda;
    }

    public int getRoda(){
        return roda;
    }

    public void setJenisKendaraan(String jenisKendaraan){
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getJenisKendaraan(){
        return jenisKendaraan;
    }


}

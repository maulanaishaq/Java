package oop;

public class Shape {
    int size = 50;
    int getCorner(){
        return size;
    }
}

class Rectangle extends Shape{


    int getCorner() {
        return 5;
    }

    int getParentCorner(){
        super.size = 20;
        return super.getCorner();
    }




}

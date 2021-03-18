package Homework2.box;

public class  Cube extends Shape {
    double a;
    public  Cube(double a) {
        this.a = a;
    }
    @Override
    public double getVolume() {
        return Math.pow(a,3);
    }
}
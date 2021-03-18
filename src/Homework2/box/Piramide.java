package Homework2.box;

public class  Piramide extends Shape {
    double height;
    double radius;
    public Piramide(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    @Override
    public double getVolume() {
       return  1/3.0*Math.PI*Math.pow(radius,2)*height;
    }
}
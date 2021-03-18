package Box;

public class Sphere extends Shape {
    double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double getVolume() {
        return 4/3*Math.PI*Math.pow(radius,3);
    }
}
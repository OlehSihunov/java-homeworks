package Box;

public class Box {
    double maxCapacity;
    double currentCapacity;
    public Box() {
        this.maxCapacity = 100.0;
        this.currentCapacity =0;
    }
    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity =0;
    }
    public Box(double maxCapacity, double currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity =currentCapacity;
    }

    public boolean add(Shape shape) {
        if(shape.getVolume()>maxCapacity-currentCapacity) {
            return  false;
        }else {
            this.currentCapacity+=shape.getVolume();
            return  true;
        }
    }

    public  void status(){
        System.out.printf("Max: %.2f, Current: %.2f\n",maxCapacity,currentCapacity);
    }

}

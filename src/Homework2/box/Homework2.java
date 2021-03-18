package Homework2.box;

public class Homework2 {

    public static void main(String[] args) {

        Box box = new Box(550);
        Shape cube = new Cube(5);
        Shape sphere = new Sphere(3);
        Shape piramid = new Piramide(4,5);
        System.out.println(box.add(cube));
        box.status();
        System.out.println(box.add(piramid));
        box.status();
        System.out.println(box.add(sphere));
        box.status();
        System.out.println(box.add(cube));
        box.status();
        System.out.println(box.add(piramid));
        box.status();
        System.out.println(box.add(cube));
        box.status();
    }
}

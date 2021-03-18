package Box;

import Box.Box;
import Box.Shape;
import Box.Shape;
import Box.Sphere;
import Box.Cube;
import Box.Piramide;
import Sort.BubbleSort;
import Sort.QuickSort;
import Sort.Sort;
import customLinkedList.customLinkedList;

import java.util.ArrayList;
import java.util.List;

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

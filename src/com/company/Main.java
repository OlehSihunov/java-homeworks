package com.company;
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

public class Main {

    public static void main(String[] args) {

      /*  Homework1
        ArrayList<Integer> mirrorPrimes = getMirrorPrimes(0,1000);
        ArrayList<Integer> primes = getPrimes(0,1000);
        for (int item : primes){
            System.out.print(item + " ");
        }
        System.out.println("\nPrimes^^^ ");
        for (int item : mirrorPrimes){
            System.out.print(item + " ");
        }
        System.out.println("\nPalindrromic primes^^^");

        */
        /*HomeWork 2
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

    */
        /* Homework 3
        Double[] array = {0.1, -156.5, 132.1, 267.4, 695.1 };
        Sort bsort = new BubbleSort();
        Sort qsort = new QuickSort();
        for(double item : array) System.out.println(item);
        qsort.sort(array);
        System.out.println("***************************************************");
        for(double item : array) System.out.println(item);*/


	/*  Homework 4*/
        customLinkedList<String> list  = new customLinkedList<String>();
        list.addLast("Hello");
        list.addLast("World");
        list.addLast("From");
        list.printList();
        System.out.println(list.get(1));
        System.out.println(list.contains("World"));
        list.remove("World");
        list.addFirst("Java");
        try {
            list.remove(6);
        }
        catch (Exception e){
            System.out.println(e);
        }

        list.printList();
    }

    private  static ArrayList<Integer> getPrimes(int min, int max) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            double limit = Math.sqrt(i) + 1;
            boolean isPrime = true;
            for (int j = 2; j < limit; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if(isPrime)
            result.add(i);
        }
        return result;
    }
    private  static ArrayList<Integer> getMirrorPrimes(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i : getPrimes(min,max)) {
            boolean ispalindrome = String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString());
            if(ispalindrome){
                result.add(i);
            }
        }
        return result;
    }
}




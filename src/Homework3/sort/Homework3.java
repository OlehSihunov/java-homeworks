package Homework3.sort;


public  class Homework3 {

    public static void main(String[] args) {


        Double[] array = {0.1, -156.5, 132.1, 267.4, 695.1 };
        Sort bsort = new BubbleSort();
        QuickSort qsort = new QuickSort();
        for(double item : array) System.out.println(item);
        qsort.sort(array,0,array.length-1);
        System.out.println("***************************************************");
        for(double item : array) System.out.println(item);
    }
}




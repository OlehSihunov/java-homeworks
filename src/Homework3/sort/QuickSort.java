package Homework3.sort;

public class QuickSort<T extends Comparable> implements  Sort<T >{
    public int low;
    public int high;
    public  void sort(T[] array) {
        if (array.length == 0||low >= high){
            return;
        }
        T wall = array[low + (high - low) / 2];
        int i = low;
        int j = high;
        while (i < j) {
            while (array[i].compareTo(wall)<0) {
                i++;
            }

            while (array[i].compareTo(wall)>0) {
                j--;
            }

            if (i < j) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j){
            sort(array);
        }
        if (high > i){
            sort(array);
        }

    }
}
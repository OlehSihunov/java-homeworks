package Homework3.sort;


public class BubbleSort<T extends Comparable> implements Sort<T> {
    @Override
    public void sort(T[] array) {
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++){
                if (array[j].compareTo(array[i])>0)
                {
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

    }
}

package Homework3.sort;

public class QuickSort<T extends Comparable> {
    public void sort(T[] array, int low, int high) {
        if (array.length == 0||low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        T opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while ((double)array[i] < (double)opora) {
                i++;
            }

            while ((double)array[j] > (double) opora) {
                j--;
            }

            if (i <= j) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(array, low, j);

        if (high > i)
            sort(array, i, high);
    }
}
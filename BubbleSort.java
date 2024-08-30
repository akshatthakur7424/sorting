package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 9, 2, 4, 5, -2, 10, 6, 0, 3, 1, 5, 3, -8, 8, 7 };
        System.out.println("Unsorted Array : " + Arrays.toString(array));

        // bubble sort

        // ascending order
        for (int i = 0; i < (array.length - 1); i++) {              // running inner loop array.length-1(number of elements in the array) times 
            for (int j = 0; j < (array.length - 1 - i); j++) {      // each itration is setting one element in the correct position. 
                if (array[j] > array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted Array Ascending Order : " + Arrays.toString(array));

        // descending order
        for (int i = 0; i < (array.length - 1); i++) {              // running inner loop array.length-1(number of elements in the array) times 
            for (int j = 0; j < (array.length - 1 - i); j++) {      // each itration is setting one element in the correct position. 
                if (array[j] < array[j + 1]) {
                    // swap
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted Array Descending Order : " + Arrays.toString(array));
    }
}
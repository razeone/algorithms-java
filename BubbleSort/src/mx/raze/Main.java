package mx.raze;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {89,998,6,7,8,80,67};
        System.out.println("Original array: " + Arrays.toString(myArray));
        bubbleSort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }

    static void bubbleSort(int[] lst) {
        int n = lst.length;
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0; i < n-1; i++) {
                if (lst[i] > lst[i+1]) {
                    int temp = lst[i];
                    lst[i] = lst[i+1];
                    lst[i+1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}

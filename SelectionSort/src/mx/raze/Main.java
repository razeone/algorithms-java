package mx.raze;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {45,6,7,98,90,3,77};
        System.out.println("Original array: " + Arrays.toString(myArray));
        selectionSort(myArray);
        System.out.println("Sorted array: " + Arrays.toString(myArray));
    }

    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}

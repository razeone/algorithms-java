package mx.raze;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = {1,3,4,5,7,9,13,15,16,17,19};
        System.out.println(binarySearch(1, myArray, 0, 11));
    }

    static boolean binarySearch(int v, int[] lst, int low, int high) {
        if (low > high) {
            System.out.println("not found");
            return false;
        }

        int middle = (low+high)/2;

        if (v == lst[middle]) {
            System.out.println("found! It is at " + middle);
            return true;
        }
        else if (v > lst[middle]) {
            return binarySearch(v, lst, middle+1, high);
        }
        else {
            return binarySearch(v, lst, low, middle-1);
        }
    }
}

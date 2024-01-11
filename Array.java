import java.util.Arrays;

public class Array {

    public static void reduceBy2(int[] arr, int index) {
        if (index == arr.length) { // Base case: end of array reached
            return;
        }
        arr[index] -= 2; // Reduce the current element by 2
        reduceBy2(arr, index + 1); // Recursively process the next element
    }

    public static void main(String[] args) {
        int[] inputArray = { 1, 2, 3, 4, 5 };

        System.out.println("Input Array: " + Arrays.toString(inputArray));

        reduceBy2(inputArray, 0); // Start recursion from index 0

        System.out.println("Output Array: " + Arrays.toString(inputArray));
    }
}

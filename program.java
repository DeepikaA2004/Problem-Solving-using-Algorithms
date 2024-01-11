import java.util.Arrays;
import java.util.Scanner;

public class program {

    public static void reduceBy2(int[] arr, int index) {
        if (index == arr.length) { // Base case: end of array reached
            return;
        }
        arr[index] -= 2; // Reduce the current element by 2
        reduceBy2(arr, index + 1); // Recursively process the next element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        System.out.println("Input Array: " + Arrays.toString(inputArray));
        reduceBy2(inputArray, 0); // Start recursion from index 0
        System.out.println("Output Array: " + Arrays.toString(inputArray));
    }
}
/*
 * public static void changeArr(int arr[],int i,int val){
 * if(arr==length){
 * printArr(arr);
 * return;
 * }
 * arr[i] = val;
 * changeArr(arr,i+1,val+1);
 * arr[i]=arr[i]-2;
 * }
 * public static void main(String[] args){
 * int arr[] = new int[5];
 * changeArr(arr,0,1);
 * printArr(arr);
 * }
 * 
 */
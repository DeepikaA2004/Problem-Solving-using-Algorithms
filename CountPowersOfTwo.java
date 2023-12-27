import java.util.Scanner;

public class CountPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array (2 <= n <= 1000000): ");
        int n = scanner.nextInt();

        // Input array values
        int[] array = new int[n];
        System.out.println("Enter the array values (0 <= value <= 4096):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Count the number of elements that are powers of 2
        int count = countPowersOfTwo(array);
        System.out.println("Number of elements that are powers of 2: " + count);
    }

    public static int countPowersOfTwo(int[] arr) {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // Compare arr[i] with every other element in the array
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    // Check if arr[i] is a power of 2 using bitwise AND
                    if ((arr[i] & arr[j]) == arr[i]) {
                        count++;
                        break; // Break out of the inner loop if a match is found
                    }
                }
            }
        }

        return count;
    }
}

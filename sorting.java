public class sorting {

    public static void main(String[] args) {
        int[] array = { 1, 9, 2, 6, 2, 1 };
        System.out.println(isSorted(array, 3)); // prints false
    }

    public static boolean isSorted(int[] array, int index) {
        if (index >= array.length - 1) {
            return true; // base case: the array is sorted after the given index
        }
        if (array[index] > array[index + 1]) {
            return false; // the array is not sorted after the given index
        }
        return isSorted(array, index + 1); // recursively check the rest of the array
    }
}

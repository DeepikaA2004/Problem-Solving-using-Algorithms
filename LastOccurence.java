public class LastOccurence {

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 5, 2 };
        int key = 2;
        int lastOccurrence = findLastOccurrence(array, key, array.length - 1);
        System.out.println("The last occurrence of " + key + " is at index " + lastOccurrence);
    }

    public static int findLastOccurrence(int[] array, int key, int endIndex) {
        if (endIndex < 0) {
            return -1;
        }

        if (array[endIndex] == key) {
            return endIndex;
        }

        return findLastOccurrence(array, key, endIndex - 1);
    }
}
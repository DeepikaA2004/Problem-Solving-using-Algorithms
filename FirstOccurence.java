public class FirstOccurence {

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 7, 9, 1, 4, 6, 8, 10 };
        int n = arr.length;
        int key = 1;
        int index = findFirstOccurrence(arr, 0, n - 1, key);
        if (index != -1)
            System.out.println("First occurrence of " + key + " is at index " + index);
        else
            System.out.println("Key not found");
    }

    static int findFirstOccurrence(int arr[], int low, int high, int key) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || key > arr[mid - 1]) && arr[mid] == key)
                return mid;
            if (key > arr[mid])
                return findFirstOccurrence(arr, mid + 1, high, key);
            return findFirstOccurrence(arr, low, mid - 1, key);
        }
        return -1;
    }
}
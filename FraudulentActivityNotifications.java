import java.util.Scanner;

public class FraudulentActivityNotifications {

    static int[] arr = new int[200010];
    static int[] tempArr = new int[200010];
    static int[] counts = new int[210];

    static float getMedian(int size) {
        int index = 0;
        for (int i = 0; i < 210; i++) {
            int count = counts[i];
            while (count-- > 0) {
                tempArr[index++] = i;
                if (index > size / 2) {
                    break;
                }
            }
            if (index > size / 2) {
                break;
            }
        }
        return size % 2 == 1 ? tempArr[size / 2] : (tempArr[size / 2] + tempArr[size / 2 - 1]) / 2.0f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int alarmCount = 0;
        float median = 210;

        for (int i = 0; i < d; i++) {
            counts[arr[i]]++;
        }

        median = getMedian(d);

        for (int i = d; i < n; i++) {
            if (arr[i] >= 2 * median) {
                alarmCount++;
            }

            // Update counts array
            counts[arr[i - d]]--;
            counts[arr[i]]++;

            median = getMedian(d);
        }

        System.out.println(alarmCount);
    }
}
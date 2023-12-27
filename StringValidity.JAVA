import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringValidity {

    public static String isValid(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int firstFrequency = -1;
        int differentFrequencyCount = 0;

        for (int frequency : frequencyMap.values()) {
            if (firstFrequency == -1) {
                firstFrequency = frequency;
            } else {
                if (frequency != firstFrequency) {
                    differentFrequencyCount++;

                    // If more than one different frequency is encountered, return "NO"
                    if (differentFrequencyCount > 1) {
                        return "NO";
                    }
                }
            }
        }

        // If the loop completes, at most one character can be removed to make the string valid
        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Call the isValid function
        String result = isValid(inputString);

        // Print the result
        System.out.println("Result: " + result);
    }
}

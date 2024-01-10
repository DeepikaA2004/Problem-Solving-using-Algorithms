public class Recursion {

    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int number) {
        if (number > 0) {
            System.out.println(number);
            printNumbers(number - 1);
        }
    }
}
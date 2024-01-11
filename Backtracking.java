public class Backtracking {

    public static void main(String[] args) {
        printNumbers(10);
    }

    public static void printNumbers(int number) {
        if (number > 0) {
            System.out.print(number + " ");
            printNumbers(number - 1);
            System.out.print(" " + number + " ");
        }
    }
}

// 1) using recursion and method if we given number 10 it prints from 1 to 10
// (decreasing order)
// public class Recursion {

// public static void main(String[] args) {
// printNumbers(10);
// }

// public static void printNumbers(int number) {
// if (number > 0) {
// System.out.println(number);
// printNumbers(number - 1);
// }
// }
// } 10 9 8 7 6 5 4 3 2 1

// 2) using recursion creating increasing order method if we given number 10 it
// print 1 to 10(ascending)

// public class increasing {
// public static void main(String[] args) {
// increasingOrder(10);
// }

// public static void increasingOrder(int num) {
// if (num > 0) {
// increasingOrder(num - 1);
// System.out.print(num + " ");
// }
// }
// } 1 2 3 4 5 6 7 8 9 10

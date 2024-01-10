public class xn {

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = power(x, n);
        System.out.println("Result for X's power n is: " + result);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
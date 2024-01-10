public class Natural {

    public static void main(String[] args) {
        System.out.println(sumNaturalNumbers(10));
    }

    public static int sumNaturalNumbers(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return (n * (n + 1)) / 2;
        }
    }
}
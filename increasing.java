public class increasing {
    public static void main(String[] args) {
        increasingOrder(10);
    }

    public static void increasingOrder(int num) {
        if (num > 0) {
            increasingOrder(num - 1);
            System.out.print(num + " ");
        }
    }
}
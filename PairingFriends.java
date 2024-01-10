public class PairingFriends {
    public static int pairingfriends(int n) {
        if (n == 1 || n == 2) {
            return n;
        } else {
            return (pairingfriends(n - 1) + (n - 1) * pairingfriends(n - 2));
        }
    }
}

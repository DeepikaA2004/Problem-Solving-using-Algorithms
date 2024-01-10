public class Tiling {
    private static int mod = 1000000007;

    public static void main(String[] args) {
        int n = 10;
        System.out.println(countWays(n));
    }

    public static long countWays(int n) {
        if (n == 0)
            return 1;

        long[] ways = new long[n + 1];
        ways[0] = 1;

        for (int i = 1; i <= n; i++) {
            ways[i] = (ways[i - 1] * 2) % mod;

            if (i >= 2)
                ways[i] = (ways[i] + ways[i - 2]) % mod;
        }

        return ways[n];
    }
}
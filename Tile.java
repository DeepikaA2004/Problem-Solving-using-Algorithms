public class Tile {
    public static int tilingproblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilingproblem(n - 1);// vertical choice
        int fnm2 = tilingproblem(n - 2);// horizontal choice
        int totways = fnm1 + fnm2;
        return totways;
    }
}

/*
 * return(tilingproblem(n-1)+tilingproble(n-2));
 */

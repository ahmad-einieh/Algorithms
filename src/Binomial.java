public class Binomial {
    public static int algorthm1(int n, int k) {
        int[][] x = new int[n+1][k+1];
        if (n == k || k == 0) {

        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || i == j) {
                    x[i][j] = 1;
                } else {
                    x[i][j] = x[i - 1][j - 1] + x[i - 1][j];
                }

            }
        }
        return x[n][k];
    }

    public static void main(String[] args) {
        System.out.println(algorthm1(4, 2));
    }
}

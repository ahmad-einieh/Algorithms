import java.util.Arrays;

public class LongestCommonSubsequence {
    public static int n;
    public static int m;

    public static int findMax(int mat[][]) {
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (mat[i][j] > maxElement) {
                    maxElement = mat[i][j];
                }
            }
        }
        return maxElement;
    }


    public static int LCS(String A, String B) {
        n = A.length();
        m = B.length();
        int[][] c = new int[n + 1][m + 1];

        for (int i = 0; i <= A.length(); i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j <= B.length(); j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i <=A.length(); i++) {
            for (int j = 1; j <= B.length(); j++) {
                if (A.charAt(i-1) == B.charAt(j-1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Integer.max(c[i - 1][j], c[i][j - 1]);
                }
            }
        }
        return findMax(c);
    }

    public static void main(String[] args) {

        System.out.println(LCS("ABCBDAB", "BDCABA"));
        System.out.println(LCS("ACELSFRE", "ASELFOXR"));
        System.out.println(LCS("abcde", "ace"));
    }
}

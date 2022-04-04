public class FibonacciNumber {
    public static int FN(int n) {
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0)
                arr[i] = 0;
            else if (i == 1)
                arr[i] = 1;
            else
                arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(FN(4));
    }
}

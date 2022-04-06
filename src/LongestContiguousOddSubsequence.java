import java.util.Arrays;

public class LongestContiguousOddSubsequence {
    public static int LCOS(int[] nums) {
        int[] n2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                n2[i] = 0;
            } else {
                n2[i] = 1;
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] % 2 != 0 && nums[i] % 2 != 0)
                n2[i] = n2[i - 1] + 1;
        }

        for (int i = 0; i < n2.length; i++) {
            System.out.print(n2[i] + " ");
        }
        System.out.println();
        return Arrays.stream(n2).max().getAsInt();
    }

    public static void main(String[] args) {
        //int[] arr = {2, 4, 1, 7, 9, 5, 2, 7, 11, 17, 1};
        int[] arr = {1, 2, 19, 5, 4, 7, 51, 23, 22, 13, 15, 36};
        System.out.println(LCOS(arr));
    }
}

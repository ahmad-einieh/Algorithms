import java.util.Arrays;

public class LongestDecreasingSubsequence {
    public static int LDS(int[] nums) {
        int[] num2 = new int[nums.length];
        Arrays.fill(num2, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] < nums[j] && num2[i]  <= num2[j])
                    num2[i] = num2[i] +1 ;
            }
        }
        return Arrays.stream(num2).max().getAsInt();
    }

    public static void main(String[] args) {
        //int[] arr = {2, 4, 1, 7, 9};
        //int[] arr = {15, 27, 14, 38, 63, 55, 46, 65, 85};
        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        //int[] arr = {50, 3, 10, 7, 40, 80};
        System.out.println(LDS(arr));
    }
}

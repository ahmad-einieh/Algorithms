import java.util.Arrays;

public class LongestIncreasingSubsequance {


    public static int LIS(int[] nums) {
        int[] num2 = new int[nums.length];
        Arrays.fill(num2, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (nums[i] > nums[j] && num2[j] >= num2[i]) {
                    num2[i] = num2[j] + 1;
                }
            }
        }

        return Arrays.stream(num2).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 9};
        System.out.println(LIS(arr));
    }
}

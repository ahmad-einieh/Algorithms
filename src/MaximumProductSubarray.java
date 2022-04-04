import java.util.Arrays;

public class MaximumProductSubarray {

    public static int MPS(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int generalMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Integer.max(nums[i], nums[i] * max);
            min = Integer.min(nums[i], nums[i] * min);
            generalMax = Integer.max(generalMax, max);
        }
        return generalMax;
    }

    public static void main(String[] args) {
        //int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr = {2, 3, -2, 4};
        System.out.println(MPS(arr));
    }
}

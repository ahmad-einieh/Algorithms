import java.util.Arrays;

public class MaxContigousSum {

    public static int MCS(int[] nums) {
        int[] arr2 = new int[nums.length];
        arr2[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + arr2[i - 1] < nums[i])
                arr2[i] = nums[i];
            else
                arr2[i] = nums[i] + arr2[i - 1];
        }
        return Arrays.stream(arr2).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(MCS(arr));
    }

}

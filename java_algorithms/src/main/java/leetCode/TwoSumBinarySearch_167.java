package leetCode;

import java.util.Arrays;

public class TwoSumBinarySearch_167 {
    public static void main(String[] args) {
        int[] data = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(data, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = {-1, -1};
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if(nums[i] + nums[j] > target ) {
                
            }
        }
        return results;
    }
}

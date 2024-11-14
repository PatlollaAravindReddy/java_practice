package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        int[] results = {-1, -1};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i<nums.length; i++) {
            if(hm.containsKey(target - nums[i])) {
                results[0] = hm.get(target - nums[i]);
                results[1] = i;
            } else {
                hm.put(nums[i], i);
            }
        }
        return results;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] nums2 = nums.clone();
        int[] results = {-1, -1};
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;
        Arrays.sort(nums);
        while(left < right) {
            sum = nums[left] + nums[right];
            if(sum == target) {
                int firstIndex = -1, secondIndex = -1;
                for (int i = 0; i < nums2.length; i++) {
                    if (nums2[i] == nums[left] && firstIndex == -1) {
                        firstIndex = i;
                    } else if (nums2[i] == nums[right]) {
                        secondIndex = i;
                    }
                }
                return new int[]{firstIndex, secondIndex};
            }
            else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return results;
    }
}

package leetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
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
}

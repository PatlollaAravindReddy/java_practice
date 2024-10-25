package leetCode;

import java.util.HashMap;

public class MaximumSumofDistinctSubArray_2461 {
    public static void main(String[] args) {
        int[] data = {1,5,4,2,9,9,9};
        int no = 3;
        System.out.println(maximumSubarraySum(data, no));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxsum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            sum = sum + nums[i];
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            if(i >= k - 1) {
                maxsum = (hm.size() == k) ? Math.max(maxsum, sum) : maxsum;
                sum = sum - nums[i - k + 1];
                hm.put(nums[i - k + 1], hm.get(nums[i - k + 1]) - 1);
                if(hm.get(nums[i - k + 1]) == 0) {
                    hm.remove(nums[i - k + 1]);
                }
            }
        }
        return maxsum;
    }
}

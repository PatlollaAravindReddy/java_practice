package leetCode;

public class MinimumSizeSubArraySum_209 {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        int k = 11;
        System.out.println(minSubArrayLen(k, data));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minLength = nums.length + 1;
        while(r <= nums.length - 1 && l <= nums.length - 1) {
            sum = sum + nums[r];
            if(sum >= target) {
                minLength = Math.min(minLength, r - l + 1);
            }
            while (sum > target) {
                sum = sum - nums[l];
                l++;
                if(sum >= target) {
                    minLength = Math.min(minLength, r - l + 1);
                }
            }

            r = r + 1;
        }
        return minLength == nums.length + 1 ? 0 : minLength;
    }
}

package leetCode;

public class MaximumAverageSubArrayI_643 {
    public static void main(String[] args) {
        int[] data = {-1};
        int no = 1;
        System.out.println(findMaxAverage(data, no));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int r = 0;
        double sum = 0;
        double result = Double.NEGATIVE_INFINITY;
        while(r < nums.length) {
            sum += nums[r];
            if(r >= k - 1) {
                result = result > sum/k ? result : sum/k;
                sum -= nums[l];
                l++;
            }
            r++;
        }
        return result;
    }
}

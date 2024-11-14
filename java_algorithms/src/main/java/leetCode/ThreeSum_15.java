package leetCode;
import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {
        int[] data = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(data));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> hs = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int temp = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = temp + nums[left] + nums[right];
                if(sum == 0) {
                    hs.add(Arrays.asList(temp, nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return new ArrayList<>(hs);
    }
}

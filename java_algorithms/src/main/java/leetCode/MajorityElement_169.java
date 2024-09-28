package leetCode;

public class MajorityElement_169 {
    public static void main(String[] args) {
        int[] data = {2, 2, 2, 1, 1, 2, 2, 2};
        System.out.println(majorityElement(data));
    }

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }
            if(candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}

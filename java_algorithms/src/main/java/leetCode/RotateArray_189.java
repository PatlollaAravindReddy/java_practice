package leetCode;

public class RotateArray_189 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7};
        int no = 3;
        rotate(data, no);
    }

    public static void rotate(int[] nums, int k) {
        if(k > nums.length - 1) {
            k = k - nums.length;
        }
        // k = k % nums.length;
        rotateArray(nums, 0, nums.length - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, nums.length - 1);
    }

    static void rotateArray(int[] nums, int start, int end) {
        while(start <= end && end < nums.length) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

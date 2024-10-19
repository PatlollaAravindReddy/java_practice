package leetCode;

public class JumpGame_55 {
    public static void main(String[] args) {
        int[] data = {2, 5, 1, 1, 0, 0, 1, 4};
        System.out.println(canJump(data));
    }

    public static boolean canJump(int[] nums) {
        if(nums.length == 0) {
            return true;
        }
        int final1 = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            if(i + nums[i] >= final1) {
                final1 = i;
            }
        }
        if(final1 == 0) {
            return true;
        }
        return false;
    }
}

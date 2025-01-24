package leetCode.twopointer;

public class twosum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        int[] result = pointerhelper(nums, target);
        System.out.println(result[0]+ " " + result[1]);
    }

    static int[] pointerhelper(int[] data, int target) {
        int left = 0;
        int right = data.length - 1;
        int[] result = {-1, -1};
        while(left < right) {
            if(target == data[left] + data[right]) {
                result[0] = left;
                result[1] = right;
                return result;
            } else if (target < data[left] + data[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}

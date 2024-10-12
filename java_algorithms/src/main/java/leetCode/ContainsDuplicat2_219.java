package leetCode;

import java.util.HashMap;

public class ContainsDuplicat2_219 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int no = 3;
        System.out.println(containsNearbyDuplicate(nums, no));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int no) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i< nums.length ; i++) {
            if(hm.containsKey(nums[i])) {
                int j = hm.get(nums[i]);
                if(Math.abs(j - i) <= no) {
                    return true;
                } else {
                    hm.put(nums[i], i);
                }
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}

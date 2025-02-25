package dsa.subsets;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class permutations_46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        permutationHelper(nums).stream().forEach(n -> System.out.println(n));
    }

    static List<List<Integer>> permutationHelper(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> temp = new LinkedList<>();
        temp.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int n = temp.size();
            for (int k = 0; k < n; k++) {
                List<Integer> ll = temp.poll();
                for (int j = 0; j < ll.size() + 1; j++) {
                    List<Integer> templist = new ArrayList<>(ll);
                    templist.add(j, nums[i]);
                    if (templist.size() == nums.length) {
                        result.add(templist);
                    } else {
                        temp.add(templist);
                    }
                }
            }
        }
        return result;
    }
}

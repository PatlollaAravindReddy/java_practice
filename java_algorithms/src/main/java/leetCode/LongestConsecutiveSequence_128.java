package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestConsecutiveSequence_128 {
    public static void main(String[] args) {
        int data[] = {100, 4, 101, 1, 2, 3};
        System.out.println(longestConsecutive(data));
    }

    public static int longestConsecutive(int[] data) {
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        for(int i = 0 ; i < data.length; i++) {
            hm.put(data[i], Boolean.FALSE);
        }
        int finalCount = 0;
        for(int num : data) {
            int no = num;
            int currentCount = 0;
            while (hm.containsKey(no) && hm.get(no) == false) {
                hm.put(no, Boolean.TRUE);
                currentCount++;
                no = no + 1;
            }
            int no2 = num - 1;
            while (hm.containsKey(no2) && hm.get(no2) == false) {
                hm.put(no2, Boolean.TRUE);
                currentCount++;
                no2 = no2 - 1;
            }
            finalCount = Math.max(finalCount, currentCount);
        }
        return finalCount;
    }
}

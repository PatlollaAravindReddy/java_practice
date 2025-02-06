package leetCode.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class insertinterval_57 {
    public static void main(String[] args) {
        int[][] data = {{1, 5}};
        int[] insert= {6, 8};
        Arrays.stream(inserthelper(data, insert)).forEach(n-> System.out.println(n[0] + " " + n[1]));
    }

    static int[][] inserthelper(int[][] intervals, int[] newInterval) {
            List<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
            intervalList.add(newInterval);
            Collections.sort(intervalList, (a, b) -> Integer.compare(a[0], b[0]));
            List<int[]> res = new ArrayList<>();
            int[] current = intervalList.get(0);
            for (int i = 1; i < intervalList.size(); i++) {
                int[] interval = intervalList.get(i);
                if (current[1] >= interval[0]) {
                    current[1] = Math.max(current[1], interval[1]);
                } else {
                    res.add(current);
                    current = interval;
                }
            }
            res.add(current);
            return res.toArray(new int[res.size()][]);
        }
}

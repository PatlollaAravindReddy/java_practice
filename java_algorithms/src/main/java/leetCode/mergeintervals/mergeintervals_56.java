package leetCode.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeintervals_56 {
    public static void main(String[] args) {
        int[][] data = {{1, 4}, {3, 7}, {8, 10}, {2, 6}, {12, 14}};
        Arrays.stream(intervalhelper(data)).forEach(n-> System.out.println(n[0] + " " + n[1]));
    }

    static int[][] intervalhelper(int[][] data) {
        if(data.length < 2) {
            return data;
        }
        Arrays.sort(data, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<int[]>();

        int[] prev = data[0];
        for(int i = 1; i < data.length ; i++) {
            int[] current = data[i];
            if(current[0] <= prev[1]) {
                prev[1] = Math.max(prev[1], current[1]);
            } else {
                result.add(prev);
                prev = current;
            }
        }
        result.add(prev);
        return result.toArray(new int[result.size()][]);
    }
}

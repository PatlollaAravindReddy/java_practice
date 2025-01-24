package leetCode.twopointer;

import java.util.*;

public class Tripletsumtozero {
    public static void main(String[] args) {
        int[] data = {-3, 0, 1, 2, -1, 1, -2};
        triplethelper(data);
    }

    static void triplethelper(int[] data) {
        Set<List<Integer>> hs = new HashSet<>();
        Arrays.sort(data);
        for(int i = 0; i < data.length - 2; i++) {
            int num = data[i];
            int left = i + 1;
            int right = data.length - 1;
            while(left < right) {
                int sum = num + data[left] + data[right];
                if(sum == 0) {
                    hs.add(Arrays.asList(num ,data[left] ,data[right]));
                    left++;
                    right--;
                } else if(sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

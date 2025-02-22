package dsa.subsets;

import java.util.*;

public class subsetsII_90 {
    public static void main(String[] args) {
        int[] data = {1, 2, 2};
        subsetHelper(data).stream().forEach(n -> System.out.println(n));
    }

    static List<List<Integer>> subsetHelper(int[] data) {
        Arrays.sort(data);
        List<List<Integer>> ll = new ArrayList<>();
        ll.add(new ArrayList<>());
        int startIndex = 0, endIndex = 0;
        for(int i = 0; i < data.length; i++) {
            startIndex = 0;
            if(i > 0 && data[i] == data[i - 1]) {
                startIndex = endIndex + 1;
            }
            endIndex = ll.size() - 1;
            for(int j = startIndex ; j <= endIndex; j++) {
                List<Integer> ll2 = new ArrayList<>(ll.get(j));
                ll2.add(data[i]);
                ll.add(ll2);
            }
        }
        return ll;
    }
}

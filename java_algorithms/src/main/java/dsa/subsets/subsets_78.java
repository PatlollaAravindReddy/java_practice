package dsa.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class subsets_78 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        subsetHelper(data).stream().forEach(n -> System.out.println(n));
    }

    static List<List<Integer>> subsetHelper(int[] data) {
        List<List<Integer>> ll = new ArrayList<>();
        ll.add(Arrays.asList());
        for(int i = 0; i< data.length ; i++) {
            int size = ll.size();
            int a = data[i];
            for(int j = 0; j < size; j++) {
                List<Integer> modifiedList = new ArrayList<>(ll.get(j));
                modifiedList.add(a);
                ll.add(modifiedList);
            }
        }
        return ll;
    }
}

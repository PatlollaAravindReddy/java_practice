package leetCode.slidingwindow;

import java.util.HashMap;

public class fruitsintobucket_904 {
    public static void main(String[] args) {
        char[] data = {'C', 'C', 'C', 'A', 'B', 'A', 'A', 'B', 'C', 'C', 'D'};
        System.out.println(fruitscount(data));
    }

    static int fruitscount(char[] data) {
        int left = 0;
        int finalresult = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < data.length; i ++) {
            char individual = data[i];
            hm.put(individual, hm.getOrDefault(individual, 0) + 1);
            while(hm.size() > 2) {
                hm.put(data[left], hm.get(data[left]) - 1);
                if(hm.get(data[left]) == 0) {
                    hm.remove(data[left]);
                }
                left = left + 1;
            }
            finalresult = Math.max(finalresult, (i - left) + 1);
        }
        return finalresult;
    }
}

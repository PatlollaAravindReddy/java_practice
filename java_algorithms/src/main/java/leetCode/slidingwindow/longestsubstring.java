package leetCode.slidingwindow;

import java.util.HashMap;

public class longestsubstring {
    public static void main(String[] args) {
        String data = "cebbei";
        int k = 3;
        System.out.println(substringhelp(data, k));
    }

    static String substringhelp(String data, int k) {
        if(data.length() < k) {
            return data;
        }
        int left = 0;
        String finalresult = "";
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(int i = 0; i< data.length(); i++) {
            char currentChar = data.charAt(i);
            hm.put(currentChar, hm.getOrDefault(currentChar, 0) + 1);
            while (hm.size() > k ) {
                String result = data.substring(left, i);
                finalresult = finalresult.length() > result.length() ? finalresult : result;
                hm.put(data.charAt(left), hm.get(data.charAt(left)) - 1);
                if(hm.get(data.charAt(left)) == 0) {
                    hm.remove(data.charAt(left));
                }
                left = left + 1;
            }
        }
        return finalresult;
    }
}

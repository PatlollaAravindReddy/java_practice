package leetCode;

import java.util.HashMap;

public class LongestSubString_3 {
    public static void main(String[] args) {
        String data= "abcabcbb";
        System.out.println(lengthOfLongestSubstring(data));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int l = 0;
        int r = 0;
        String str = "";
        int maxLength = 0;
        while (r < s.length()) {
            if(hm.containsKey(s.charAt(r))) {
                if(hm.get(s.charAt(r)) >= l) {
                    l = hm.get(s.charAt(r)) + 1;
                }
                hm.put(s.charAt(r), r);
            } else {
                hm.put(s.charAt(r), r);
            }
            maxLength = Math.max(maxLength, r -l + 1);
            r++;
        }
        return maxLength;
    }
}

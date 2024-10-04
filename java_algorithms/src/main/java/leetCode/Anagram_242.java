package leetCode;

import java.util.HashMap;

public class Anagram_242 {
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        for (int j = 0; j < t.length(); j ++) {
            if(hm.containsKey(t.charAt(j))) {
                if(hm.get(t.charAt(j))!=0) {
                    hm.put(t.charAt(j), hm.get(t.charAt(j)) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
}

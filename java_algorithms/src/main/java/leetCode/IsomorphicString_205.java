package leetCode;

import java.util.HashMap;

public class IsomorphicString_205 {
    public static void main(String[] args) {
        String s1 = "badc";
        String s2 = "baba";
        System.out.println(isIsomorphic(s1, s2));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        int i = 0;
        while (i < s.length()) {
            if (hm.containsKey(s.charAt(i))) {
                if (hm.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if (hm.containsValue(t.charAt(i))) {
                if (!hm.containsKey(s.charAt(i))) {
                    return false;
                }
            } else {
                hm.put(s.charAt(i), t.charAt(i));
            }
            i++;
        }
        return true;
    }
}

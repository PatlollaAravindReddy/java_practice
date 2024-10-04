package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class WordPattern_290 {
    public static void main(String[] args) {
        String s1 = "abba";
        String s2 = "dog dog dog dog";
        System.out.println(wordPattern(s1, s2));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String[] al = s.split(" ");
        if(pattern.length() != al.length) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++) {
            if(hm.containsKey(pattern.charAt(i))) {
                if(!hm.get(pattern.charAt(i)).equals(al[i])) {
                    return false;
                }
            } else if(hm.containsValue(al[i])) {
                if(!hm.containsKey(pattern.charAt(i))) {
                    return false;
                }
            } else {
                hm.put(pattern.charAt(i), al[i]);
            }
        }
        return true;
    }
}

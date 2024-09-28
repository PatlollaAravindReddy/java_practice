package leetCode;

import java.util.HashMap;

public class RansomNote_383 {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i =0; i < magazine.length(); i++) {
            if(hm.containsKey(magazine.charAt(i))) {
                hm.put(magazine.charAt(i), hm.get(magazine.charAt(i)) + 1);
            } else {
                hm.put(magazine.charAt(i), 1);
            }
        }
        for (int j = 0; j<ransomNote.length(); j++) {
            if(hm.containsKey(ransomNote.charAt(j))) {
                int value = hm.get(ransomNote.charAt(j));
                if(value == 0) {
                    return false;
                }
                hm.put(ransomNote.charAt(j), value - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}

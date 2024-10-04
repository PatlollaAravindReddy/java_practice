package leetCode;

public class AnagramAscii_242 {
    public static void main(String[] args)  {
            String s1 = "anagram";
            String s2 = "nagaram";
            System.out.println(isAnagram(s1, s2));
    }

        public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] data = new int[26];
        for(int i = 0; i < s.length(); i++) {
            data[s.charAt(i) - 'a']++;
            data[t.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(data[i] != 0) {
                return false;
            }
        }
        return true;
        }
}

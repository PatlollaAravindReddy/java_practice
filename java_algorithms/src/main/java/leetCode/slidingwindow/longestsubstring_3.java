package leetCode.slidingwindow;

import java.util.HashMap;

public class longestsubstring_3 {
    public static void main(String[] args) {
        String data = "pwwkew";
        System.out.println(substringhelper(data));
    }

    static int substringhelper(String data) {
        int finalResult = 0;
        int left = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < data.length(); i++) {
            char dataChar = data.charAt(i);
            hm.put(dataChar, hm.getOrDefault(dataChar, 0) + 1);
            while (hm.get(dataChar) > 1) {
                hm.put(data.charAt(left), hm.get(data.charAt(left)) - 1);
                if(hm.get(data.charAt(left)) == 0) {
                    hm.remove(data.charAt(left));
                }
                left = left + 1;
            }
            finalResult = Math.max(finalResult, i - left + 1);
        }
        return finalResult;
    }
}

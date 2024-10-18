package leetCode;

import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] data = { "dog","dracecar","dcar"};
        System.out.println(longestCommonPrefix(data));
        System.out.println(longestCommonPrefix2(data));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        String data = strs[0];
        for(int i = 1; i< strs.length; i++) {
            int j = 0;
            StringBuilder result2 = new StringBuilder();
            while(j < strs[i].length() && j < data.length() && data.charAt(j) == strs[i].charAt(j)) {
                result2.append(data.charAt(j));
                j++;
            }
            result = result.length() < result2.length() ? result : result2.toString();
        }
        return result;
    }

    public static String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for(int i = 0; i < strs[0].length() ; i++) {
            if(first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}

package leetCode;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[] data = { "dog","racecar","car"};
        System.out.println(longestCommonPrefix(data));
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
}

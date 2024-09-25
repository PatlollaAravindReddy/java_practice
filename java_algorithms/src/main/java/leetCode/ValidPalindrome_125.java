package leetCode;

public class ValidPalindrome_125 {
    public static void main(String[] args) {
        String data = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(data));
    }

    public static boolean isPalindrome(String s) {
        boolean result = true;
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
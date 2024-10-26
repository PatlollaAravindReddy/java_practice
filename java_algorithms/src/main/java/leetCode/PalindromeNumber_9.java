package leetCode;

import java.util.Arrays;

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int no = 121;
        System.out.println(isPalindrome(no));
    }

    public static boolean isPalindrome2(int x) {
        char[] data = (x+"").toCharArray();
        int i = 0;
        int j = data.length - 1;
        while(i < j) {
            if(data[i] != data[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int no = x;
        int sum = 0;
        while(no > 0) {
            int remi = no % 10;
            no = no / 10;
            sum = sum * 10 + remi;
        }
        return sum == x ? true : false;
    }
}

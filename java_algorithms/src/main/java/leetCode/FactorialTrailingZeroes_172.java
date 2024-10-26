package leetCode;

public class FactorialTrailingZeroes_172 {
    public static void main(String[] args) {
        int no = 13;
        System.out.println(trailingZeroes(no));
        System.out.println(trailingZeroes2(no));
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n = n/5;
            count = count + n;
        }
        return count;
    }

    public static int trailingZeroes2(int n) {
        long no = recu(n);
        char[] no2 = (no+"").toCharArray();
        int count = 0;
        int i = no2.length - 1;
        while(i >= 0) {
            if(no2[i] == '0') {
                count++;
            } else {
                break;
            }
            i--;
        }
        return count;
    }

    public static long recu(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * recu(n - 1);
    }
}

package leetCode;

import java.util.Arrays;

public class DefuseTheBomb_1652 {
    public static void main(String[] args) {
        int[] data = {2,4,9,3};
        System.out.println(decrypt(data, -2));
    }

    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int sum = 0;
        int l = 0;
        int r = 0;
        if(k > 0) {
            for (int i = 0; i < k; i++) {
                sum = sum + code[i + 1];
            }
            while (r < code.length) {
                result[r] = sum;
                sum = sum - code[((l + 1) % code.length)];
                sum = sum + code[((k + r + 1) % code.length)];
                r++;
                l++;
            }
        }
        int ll = code.length + k;
        if(k < 0) {
            for (int i = code.length - 1; i >= code.length + k; i--) {
                sum = sum + code[i];
            }
            while (r < code.length) {
                result[r] = sum;
                sum = sum - code[((ll) % code.length)];
                sum = sum + code[((r) % code.length)];
                r++;
                ll++;
            }
        }
        return result;
    }
}

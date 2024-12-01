package leetCode;

import java.util.Arrays;

public class MoveZeros_283 {
    public static void main(String[] args) {
        int[] data = {0, 1, 0, 2, 3};
        moveZeros(data);
    }

    public static void moveZeros(int[] data) {
        int i = 0;
        for(int j = 0; j < data.length; j++) {
            if(data[j] != 0) {
                data[i] = data[j];
                i++;
            }
        }
        for(int k = i; k < data.length; k++) {
            data[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(data));
    }
}

package leetCode.twopointer;

import java.util.Arrays;

public class squaringofsortedarray_977 {
    public static void main(String[] args) {
        int[] data = {-2, -1, 0, 1, 2, 3};
        Arrays.stream(sortingHelper(data)).forEach(n -> System.out.println(n));
    }

    static int[] sortingHelper(int[] data) {
        int[] data2 = new int[data.length];
        int data2Length = data.length - 1;
        int left = 0;
        int right = data.length - 1;
        while (left <= right) {
            int leftSquare = (int) Math.pow(data[left], 2);
            int rightSquare = (int) Math.pow(data[right], 2);
            if(leftSquare < rightSquare) {
                data2[data2Length] = rightSquare;
                right--;
            } else {
                data2[data2Length] = leftSquare;
                left++;
            }
            data2Length--;
        }
        return data2;
    }
}

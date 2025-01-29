package leetCode.twopointer;

import java.util.*;

public class Tripletsumclosettotarget_16 {
    public static void main(String[] args) {
        int[] data = {4,0,5,-5,3,3,0,-4,-5};
        int target = -2;
        System.out.println(triplethelper(data, target));
    }

    static int triplethelper(int[] data, int target) {
        Arrays.sort(data);
        int smallestDifference = Integer.MAX_VALUE;
        int previous = 0;
        for(int i = 0; i < data.length - 2; i++) {
            int num = data[i];
            int left = i + 1;
            int right = data.length - 1;
            while(left < right) {
                int sum = num + data[left] + data[right];
                int targetdifference = target - sum;
                if(targetdifference == 0) {
                    return sum;
                }
                if(Math.abs(targetdifference) < Math.abs(smallestDifference) || (Math.abs(targetdifference) == Math.abs(smallestDifference) && targetdifference > smallestDifference)) {
                    smallestDifference = targetdifference;
                }
                if(targetdifference > 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
       return target - smallestDifference;
    }
}

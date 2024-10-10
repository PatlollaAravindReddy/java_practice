package leetCode;

import java.util.HashMap;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int no = 19;
        System.out.println(isHappy(no));
    }

    public static boolean isHappy(int no) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = sumOfNo(no);
        while(sum != 1) {
            if(hm.containsKey(sum)) {
                return false;
            } else {
                hm.put(sum, 1);
                sum = sumOfNo(sum);
            }
        }
        return true;
    }

    public static int sumOfNo(int no) {
        int sum = 0;
        while(no != 0) {
            sum = (int) (sum + Math.pow(no%10, 2));
            no = no/10;
        }
        return sum;
    }
}

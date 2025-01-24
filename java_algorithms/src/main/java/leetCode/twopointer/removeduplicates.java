package leetCode.twopointer;

public class removeduplicates {
    public static void main(String[] args) {
        int[] data = {2, 2, 2, 11};
        System.out.println(findDuplicate(data));
    }

    static int findDuplicate(int[] data) {
        int count = 0;
        int left = 0;
        int right = 1;
        int lp = -1;
        while (right < data.length) {
                if(data[left] != lp) {
                    count++;
                    lp = data[left];
            } else if(data[right] != lp) {
                    count++;
                    lp = data[right];
            }
                left++;
                right++;
        }
        return count;
    }
}

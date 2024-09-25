package leetCode;

public class BinarySearch_34 {
    public static void main(String[] args) {
        int[] data = {5,7,7,8,8,8,8,8,8,10};
        int no = 8;
        int[] result = {-1, -1};
        result[0] = findNumber(no, 0, data.length - 1 , data, true);
        result[1] = findNumber(no,0,data.length - 1, data, false);
        System.out.println(result[0] + " " +result[1]);
    }

    static int findNumber(int no, int start, int end, int[] data, boolean ischeckEnabled) {
        int result = -1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] < no) {
                start = mid + 1;
            } else if (data[mid] > no) {
                end = mid - 1;
            } else {
                result = mid;
                if(ischeckEnabled) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}

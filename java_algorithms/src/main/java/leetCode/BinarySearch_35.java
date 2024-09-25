package leetCode;

public class BinarySearch_35 {
    public static void main(String[] args) {
        int[] data = {1,3,5,6};
        int no = 2;
        System.out.println(findNumber(no, 0, data.length - 1 , data));
    }

    static int findNumber(int no, int start, int end, int[] data) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] < no) {
                start = mid + 1;
            } else if (data[mid] > no) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end + 1;
    }
}

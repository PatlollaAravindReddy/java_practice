package dsa;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1,2,4,6,8,10,12,14,16};
        int no = 16;
        System.out.println(findNumber(no, 0, data.length , data));
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
        return -1;
    }
}

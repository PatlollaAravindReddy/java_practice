package dsa;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 8, 10, 12, 14, 16};
        int no = 14;
        System.out.println(findNumber(no, 0, data.length, data));
    }

    static int findNumber(int no, int start, int end, int[] data) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (data[mid] < no) {
            start = mid + 1;
        } else if (data[mid] > no) {
            end = mid - 1;
        } else {
            return mid;
        }
        return findNumber(no, start, end, data);
    }
}

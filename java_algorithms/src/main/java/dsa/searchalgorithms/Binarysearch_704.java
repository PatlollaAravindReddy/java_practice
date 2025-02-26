package dsa.searchalgorithms;

public class Binarysearch_704 {
    public static void main(String[] args) {
        int[] data = {-1,0,3,5,9,12};
        int target = 12;
        System.out.println(binaryHelper(data, target));
    }

    static int binaryHelper(int[] data, int target) {
        int start = 0;
        int end = data.length;
        while (start <= end && start < data.length) {
            int mid = ((end + start) / 2);
            if(data[mid]  > target) {
                end = mid - 1;
            } else if (data[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

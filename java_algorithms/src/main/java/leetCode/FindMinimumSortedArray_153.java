package leetCode;

public class FindMinimumSortedArray_153 {
    public static void main(String[] args) {
        int[] data = {11, 13, 15, 17};
        System.out.println(findMin(data));
    }

    public static int findMin(int[] data) {
        int start = 0;
        int end = data.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid > start && data[mid] < data[mid - 1]) {
                return data[mid];
            }
            if(mid < end && data[mid] > data[mid + 1]) {
                return data[mid+1];
            }
            if(data[mid] <= data[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return data[0];
    }
}

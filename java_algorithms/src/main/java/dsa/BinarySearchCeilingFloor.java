package dsa;

public class BinarySearchCeilingFloor {
    public static void main(String[] args) {
        int[] data = {1,2,4,6,8,10,12,14,16};
        int no = 11;
        System.out.println("binary search ceiling " + findNumberCeiling(no, 0, data.length , data));
        System.out.println("binary search floor " + findNumberFloor(no, 0, data.length , data));
    }

    static int findNumberCeiling(int no, int start, int end, int[] data) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] < no) {
                start = mid + 1;
            } else if (data[mid] > no) {
                end = mid - 1;
            } else {
                return data[mid];
            }
        }
        return data[start];
    }

    static int findNumberFloor(int no, int start, int end, int[] data) {
        while(start <= end) {
            int mid = (start + end) / 2;
            if (data[mid] < no) {
                start = mid + 1;
            } else if (data[mid] > no) {
                end = mid - 1;
            } else {
                return data[mid];
            }
        }
        return data[end];
    }
}

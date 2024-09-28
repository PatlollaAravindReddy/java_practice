package leetCode;

public class SearchInRotatedSortedArray_33 {
    public static void main(String[] args) {
        int[] data = {5, 1, 3};
        int no = 5;
        System.out.println(searchInArray(data, no));
    }

    static int searchInArray(int[] data, int no) {
        int pivot = findPivot(data);
        if(pivot == - 1) {
            return findNumber(no, 0, data.length - 1, data);
        }
        if(data[pivot] == no) {
            return pivot;
        }
        if(no >= data[0]) {
            return findNumber(no, 0, pivot - 1, data );
        }
        return findNumber(no, pivot + 1, data.length - 1, data);
    }

    static int findPivot(int[] data) {
        int start = 0;
        int end = data.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid > start && data[mid] < data[mid - 1]) {
                return mid - 1;
            }
            if(mid < end && data[mid] > data[mid + 1]) {
                return mid;
            }
            if(data[mid] <= data[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
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

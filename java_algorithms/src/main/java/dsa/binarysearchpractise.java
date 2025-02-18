package dsa;

public class binarysearchpractise {
    public static void  main(String[] args) {
        int[] data = {1,2,3,4,5,6};
        int no = 5;
        System.out.println(binarySearchNumber(data, no));
    }

    static int binarySearchNumber(int[] data, int no) {
        int start = 0;
        int end = data.length - 1;
        while(start < end) {
            int mid = (end + start) / 2;
            if(data[mid] < no) {
                start = mid + 1;
            }            else if(data[mid] > no) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

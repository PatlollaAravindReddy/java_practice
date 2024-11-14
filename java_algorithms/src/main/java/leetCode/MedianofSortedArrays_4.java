package leetCode;

public class MedianofSortedArrays_4 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums, nums2));
        System.out.println(findMedianSortedArrays2(nums, nums2));
    }


    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int count = 0;
        int length = nums1.length + nums2.length;
        int[] mergedArray = new int[length];
        int size = length / 2;
        boolean isOdd = size == (length / 2.0);
        while(i <= nums1.length - 1 && j <= nums2.length - 1) {
            if(nums1[i] < nums2[j]) {
                mergedArray[count] = nums1[i];
                i++;
            } else {
                mergedArray[count] = nums2[j];
                j++;
            }
            count++;
        }

        while(i < nums1.length) {
            mergedArray[count] = nums1[i];
            i++;
            count++;
        }

        while (j < nums2.length) {
            mergedArray[count] = nums2[j];
            j++;
            count++;
        }

        if(isOdd) {
            return  (mergedArray[size - 1] + mergedArray[size]) / 2.0;
        } else {
            return mergedArray[size];
        }
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int count = 0;
        int length = nums1.length + nums2.length;
        int size = length / 2;
        double size2 = length / 2.0;
        boolean isOdd = size == size2;
        int num = 0;
        int res = 0;
        int res2 = 0;
        while(i <= nums1.length - 1 && j <= nums2.length - 1) {
            if(nums1[i] < nums2[j]) {
                num = nums1[i];
                i++;
            } else {
                num = nums2[j];
                j++;
            }
            if(count == size) {
                res = num;
            }
            if(count == size - 1) {
                res2 = num;
            }
            count++;
        }

        while(i < nums1.length) {
            if(count == size) {
                res = nums1[i];
            }
            if(count == size - 1) {
                res2 = nums1[i];
            }
            i++;
            count++;
        }

        while (j < nums2.length) {
            if(count == size) {
                res = nums2[j];
            }
            if(count == size - 1) {
                res2 = nums2[j];
            }
            j++;
            count++;
        }

        if(isOdd) {
            return (res + res2) / 2.0;
        } else {
            return res;
        }
    }
}

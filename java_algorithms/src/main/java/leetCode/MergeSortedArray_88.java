package leetCode;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int[] nums2 = {1, 2, 3};
        merge(nums1, nums1.length - nums2.length, nums2, nums2.length);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                 nums1[k] = nums2[j];
                 j--;
                 k--;
            }
        }
        while(j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        while(i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
    }
}

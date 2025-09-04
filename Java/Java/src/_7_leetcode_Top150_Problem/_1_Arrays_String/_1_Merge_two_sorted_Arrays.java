package _7_leetcode_Top150_Problem._1_Arrays_String;

import java.util.Arrays;

public class _1_Merge_two_sorted_Arrays {
    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,5,6};
        merge(nums1, nums1.length, nums2, nums2.length);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mix[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mix[k] = nums1[i];
                i++;
                k++;
            } else {
                mix[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < m) {
            mix[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            mix[k] = nums2[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mix));
    }
}

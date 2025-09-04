package Varun;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums1[] = {2};
        int nums2[] = {1};
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

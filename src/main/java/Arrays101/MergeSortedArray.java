package Arrays101;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * Constraints:
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -109 <= nums1[i], nums2[j] <= 109
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        SolutionMergeSortedArray solution = new SolutionMergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        System.out.println("Single array sorted in non-decreasing order: " + Arrays.toString(nums1));
    }
}

class SolutionMergeSortedArray {
    /**
     * Метод для поглощения массива nums2 массивом nums1 (вместо 0) и сортировки по возрастанию
     *
     * @param nums1 Массив с сортировкой по возрастанию. Вместо 0 числа из @param nums2
     * @param m     Количество элементов в массиве @param nums1
     * @param nums2 Массив с сортировкой по возрастанию.
     * @param n     Количество элементов в массиве @param nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int st1 = m - 1;
        int st2 = n - 1;
        int posMax = nums1.length - 1;
        while (st1 >= 0 && st2 >= 0) {
            int maxVal;

            if (nums1[st1] > nums2[st2]) {
                maxVal = nums1[st1];
                st1--;
            } else {
                maxVal = nums2[st2];
                st2--;
            }
            nums1[posMax] = maxVal;
            posMax--;
        }
        if (st1 < 0 && st2 >= 0) {
            while (st2 >= 0) {
                nums1[st2] = nums2[st2];
                st2--;
            }
        }

    }
}

package io.vorotovd.binarySearch;

import java.util.Arrays;

/**
 * A peak element is an element that is strictly greater than its neighbors.
 * Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
 * You must write an algorithm that runs in O(log n) time.
 * Constraints:
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */
public class FindPeakElement {
    public static void main(String[] args) {

        SolutionFindPeakElement solution = new SolutionFindPeakElement();
        int[] ar = {1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        System.out.println("Array: " + Arrays.toString(ar));
        System.out.println("Index of any of the peaks: " + solution.findPeakElement(ar));
    }
}

class SolutionFindPeakElement {

    /**
     * Метод возвращает индекс любого максимального значения в переданном массиве
     *
     * @param nums Массив элементов
     * @return Индекс одного любого максимального значения из массива
     */
    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int med = left + (right - left) / 2;
        int leftMed = left;
        int rightMed = right;

        while (left < right) {
            leftMed = getLeftBorderOfMean(med, left, nums);
            rightMed = getRightBorderOfMean(med, right, nums);
            if (leftMed <= nums[med] && nums[med] >= rightMed) {
                return med;
            }
            if (leftMed <= nums[med] && nums[med] < rightMed) {
                left = med + 1;
            } else {
                right = med - 1;
            }
            med = left + (right - left) / 2;
        }
        return med;
    }

    /**
     * Метод определяет значение слева от срединного значения
     *
     * @param med  Значение середины подмассива
     * @param left Левая граница подмассива
     * @param nums Подмассив значений
     * @return Значение левее середины подмассива
     */
    public static int getLeftBorderOfMean(int med, int left, int[] nums) {
        if (med == left) {
            return nums[med];
        } else {
            return nums[med - 1];
        }
    }

    /**
     * Метод определяет значение справа от срединного значения
     *
     * @param med   Значение середины подмассива
     * @param right Правая граница подмассива
     * @param nums  Подмассив значений
     * @return Значение левее середины подмассива
     */
    public static int getRightBorderOfMean(int med, int right, int[] nums) {
        if (med == right) {
            return nums[med];
        } else {
            return nums[med + 1];
        }
    }
}

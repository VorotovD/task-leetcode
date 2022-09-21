package io.vorotovd.binarySearch;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 * such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * You must write an algorithm with O(log n) runtime complexity.
 * Constraints:
 * 1 <= nums.length <= 5000
 * -104 <= nums[i] <= 104
 * All values of nums are unique.
 * nums is an ascending array that is possibly rotated.
 * -104 <= target <= 104
 */
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        SolutionSearchInRotatedSortedArray search = new SolutionSearchInRotatedSortedArray();

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("The index of target: " + search.search(nums, target));
    }
}

class SolutionSearchInRotatedSortedArray {
    /**
     * Метод поиска индекса значения
     *
     * @param nums   Массив, отсортированный по возрастанию и после сдвига на k элементов
     * @param target Целевое значение для поиска
     * @return Индекс целевого значения в массиве
     */
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int medium = left + (right - left) / 2;

        while (left < right) {
            if (nums[medium] > nums[right]) {
                left = medium + 1;
            } else {
                right = medium;
            }
            medium = left + (right - left) / 2;
        }

        left = 0;
        right = nums.length - 1;

        if (nums[right] < target) {
            right = medium - 1;
        } else {
            left = medium;
        }

        medium = left + (right - left) / 2;

        while (left <= right) {
            if (nums[medium] == target) {
                return medium;
            }
            if (nums[medium] > target) {
                right = medium - 1;
            } else {
                left = medium + 1;
            }
            medium = left + (right - left) / 2;
        }
        return -1;
    }
}

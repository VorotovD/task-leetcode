package io.vorotovd.binarySearch;


import java.util.Arrays;

/**
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 * You must write an algorithm with O(log n) runtime complexity.
 * Constraints:
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums is a non-decreasing array.
 * -109 <= target <= 109
 */
public class SearchForARange {
    public static void main(String[] args) {
        int[] searchArea = {0, 1, 1, 2, 2, 2, 3, 4, 4, 5, 6};
        int target = 4;
        SearchForARangeSolution solution = new SearchForARangeSolution();
        System.out.println(Arrays.toString(solution.searchRange(searchArea, target)));
    }
}

/**
 * Класс для решения задачи поиска области индексов искомого чила в массиве
 */
class SearchForARangeSolution {

    /**
     * Метод для нахождения области индексов искомого числа в массиве чисел
     *
     * @param searchArea Область поиска
     * @param target     Искомое число
     * @return Массив из начального и конечного индекса искомого числа в массиве
     */
    public int[] searchRange(int[] searchArea, int target) {
        int[] result = {-1, -1};
        if (searchArea.length == 0) {
            return result;
        }

        int left = 0;
        int right = searchArea.length - 1;
        int med = left + (right - left) / 2;

        while (searchArea[med] != target) {
            if (med == right && med == left || right < left || left > right) {
                return result;
            }
            if (searchArea[med] > target) {
                right = med - 1;
            } else if (searchArea[med] < target) {
                left = med + 1;
            }
            med = left + (right - left) / 2;
        }
        left = 0;
        right = med;
        int medToArea = left + (right - left) / 2;

        while (left <= medToArea) {
            if (searchArea[left] == target) {
                result[0] = left;
                break;
            }
            if (searchArea[medToArea] < target) {
                left = medToArea + 1;
            } else {
                left = left + 1;
            }
            medToArea = left + (right - left) / 2;
        }
        right = searchArea.length - 1;
        left = med;
        medToArea = med + (right - med) / 2;

        while (right >= medToArea) {
            if (searchArea[right] == target) {
                result[1] = right;
                break;
            }
            if (searchArea[medToArea] > target) {
                right = medToArea - 1;
            } else {
                right = right - 1;
            }
            medToArea = left + (right - left) / 2;
        }
        return result;
    }


}

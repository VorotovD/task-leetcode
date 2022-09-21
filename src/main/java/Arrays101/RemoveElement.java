package Arrays101;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 * Return k after placing the final result in the first k slots of nums.
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * Constraints:
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */
public class RemoveElement {
    public static void main(String[] args) {
        SolutionRemoveElement solution = new SolutionRemoveElement();
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println("Slots of num: " + solution.removeElement(nums, val) + ", array containing: " + Arrays.toString(nums));
        /*
          Explanation: For this input your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
          Note that the five elements can be returned in any order.
          It does not matter what you leave beyond the returned k (hence they are underscores).
         */
    }
}

class SolutionRemoveElement {
    /**
     * Метод удаляющий переданное значение из последовательности значений массива. Возвращает длину массива без удаленного значения
     *
     * @param nums Массив для удаления значения
     * @param val  Удаляемое значение
     * @return Длина последовательности значений массива без удаляемого значения
     */
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int countRemove;
        int position = 0;
        int numToInsert;
        for (int i = 0; i < nums.length; i++) {
            numToInsert = nums[i];
            if (nums[i] == val) {
                countRemove = nextRemove(i, nums, val);
                result += countRemove;
                if (i + countRemove >= nums.length) {
                    break;
                }
                i += countRemove;
                numToInsert = nums[i];
                nums[position + countRemove] = nums[i];
            }
            nums[position] = numToInsert;
            position++;
        }
        return nums.length - result;
    }

    /**
     * Метод для определения количества удаляемых значений, расположенных последовательно
     *
     * @param i    Индекс проверяемого значения
     * @param nums Массив для удаления значения
     * @param val  Удаляемое значение
     * @return Количество последовательно удаляемых значений
     */
    public int nextRemove(int i, int[] nums, int val) {
        int countToRemove = 1;
        for (int j = i; j < nums.length; j++) {
            if (j + 1 >= nums.length) {
                break;
            }
            if (nums[j + 1] == val) {
                countToRemove++;
            } else {
                break;
            }
        }
        return countToRemove;
    }
}

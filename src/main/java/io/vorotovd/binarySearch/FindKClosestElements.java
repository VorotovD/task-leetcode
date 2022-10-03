package io.vorotovd.binarySearch;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] arr = {0, 1, 2, 3, 4, 5, 7, 8, 9, 10};
        int k = 5;
        int x = 5;
        System.out.println(solution.findClosestElements(arr, k, x));
    }
}


/**
 * Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.
 * An integer a is closer to x than an integer b if:
 * |a - x| < |b - x|, or
 * |a - x| == |b - x| and a < b
 * Constraints:
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 104
 * arr is sorted in ascending order.
 * -104 <= arr[i], x <= 104
 **/

/*
 * Метод решения:
 * 1. Найти бинарным поиском два соседних с х числа так, что a <= x <= b и a < b ,
 *  где а - левый кандидат, b правый кандидат, x - целевой элемент
 * 2. Проверить кандидатов a и b на соответствие условию |a - x| < |b - x|, or |a - x| == |b - x| and a < b так, что
 * ближайший к x кандидат включаем в результурующий список. Следующий кандидат выбирается в сторону удаления на один шаг
 * от х в сторону только что включенного кандидата.
 * 3. Повторять пункт 3 пока разница между номером правого кандидата и номером левого кандидата не станет большей
 * количеству необходимых для решения элементов k.
 * 4. Добавить k элементов из исходного массива в результирующую коллекцию начиная с элемента номер а + 1
 */
class FindKClosestElementsSolution {

    /**
     * Метод поиска k ближайших элементов для x в массиве arr
     *
     * @param arr Область поиска
     * @param k   Количество ближайших элементов
     * @param x   Целевой элемент
     * @return Коллекция из k ближайших элементов к x в массиве arr
     */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left + 1 != right) {
            mid = left + (right - left) / 2;
            if (left == right) {
                break;
            }
            if (arr[mid] >= x) {
                right = mid;
            } else if (arr[mid] <= x) {
                left = mid;
            }
        }
        return getResultArray(arr, k, x, left, right);
    }

    private List<Integer> getResultArray(int[] arr, int k, int x, int left, int right) {
        List<Integer> result = new ArrayList<>();

        while (right - left <= k) {
            if (left - 1 < -1) {
                right++;
            } else if (right + 1 > arr.length) {
                left--;
            } else if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left--;
            } else {
                right++;
            }
        }
        if (right - left == 1) {
            if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                result.add(arr[left]);
            } else {
                result.add(arr[right]);
            }
            return result;
        }

        for (int i = 0; i < k; i++) {
            result.add(arr[left + 1]);
            left++;
        }

        return result;
    }
}

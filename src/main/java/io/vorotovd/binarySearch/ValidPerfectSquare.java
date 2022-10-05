package io.vorotovd.binarySearch;

/**
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * Follow up: Do not use any built-in library function such as sqrt.
 * Constraints:
 * 1 <= num <= 2^31 - 1
 */

public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        int num = 14;
        System.out.println(solution.isPerfectSquare(num));
    }
}

class ValidPerfectSquareSolution {

    /**
     * Метод возвращает true в случае, если корень num - Integer
     *
     * @param num Целевое число
     * @return Boolean является ли корень целевого числа - Integer
     */
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = 46340;
        int med;
        while (left <= right) {
            med = left + (right - left) / 2;
            if (med * med == num) {
                return true;
            }
            if (med * med < num) {
                left = med + 1;
            } else {
                right = med - 1;
            }
        }
        return false;
    }
}

package io.vorotovd.binarySearch;

/**
 * Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
 * Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
 * Constraints:
 * 0 <= x <= 231 - 1
 */
public class SqrtX {
    public static void main(String[] args) {
        SolutionSqrtX solution = new SolutionSqrtX();
        int x = 68;
        System.out.println("Integer part of the square root of " + x + ": " + solution.mySqrt(x));
    }
}

class SolutionSqrtX {
    /**
     * Метод для нахождения целой части корня от числа
     *
     * @param x Подкоренное число
     * @return Целая часть извлечения корня от x
     */
    public int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (right - left > 1) {
            long middle = (left + right) / 2;
            long sqrtMiddle = middle * middle;
            if (sqrtMiddle > x) {
                right = middle;
            } else {
                left = middle;
            }
        }
        if (right * right <= x) {
            return (int) right;
        }
        return (int) left;
    }
}

package io.vorotovd.RecursionI;

/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * Given n, calculate F(n).
 * Constraints:
 * 0 <= n <= 30
 */
public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumberSolution solution = new FibonacciNumberSolution();
        System.out.println(solution.fib(3));
    }
}

class FibonacciNumberSolution {
    private int[] nums = new int[]{1, 1};
    private int count = 2;

    /**
     * Метод возвращает число, стоящее на n месте в последовательности Фибоначчи суммированием чисел от индекса 1 до n
     * @param n Индекс числа в последовательности Фибоначчи
     * @return Сумма чисел в последовательности от 1 до n
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }
        if (count < n) {
            nums[0] = nums[0] + nums[1];
            int intResult = nums[1];
            nums[1] = nums[0];
            nums[0]=intResult;
            count++;
            fib(n);
        }
        return nums[1];
    }
}

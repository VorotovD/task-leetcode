package io.vorotovd.binarySearch;

/**
 * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 * Constraints:
 * -100.0 < x < 100.0
 * -231 <= n <= 231-1
 * n is an integer.
 * -104 <= xn <= 104
 */

public class Pow {
    public static void main(String[] args) {
        PowSolution powSolution = new PowSolution();
        System.out.println(powSolution.myPow(2, 10));
    }
}

class PowSolution {

    /**
     * Метод возвращает число x в степени n
     * @param x Основание
     * @param n Степень
     * @return x в степени n
     */
    public double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        if (n == Integer.MIN_VALUE) {
            n += 1;
            return 1 / (myPow(x, -n) * x);
        }
        if (n < 0) {
            return 1/myPow(x,-n);
        }
        double result = 1;
        if (n % 2 == 0) {
            result = myPow(x,n/2);
            return result * result;
        }
        result = myPow(x,(n-1)/2);
        return result * result * x;
    }

}

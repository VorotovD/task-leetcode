package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowTest {

    @Test
    public void powSolutionPositivePositive() {
        PowSolution test = new PowSolution();
        int x = 2;
        int n = 4;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionPositiveNegative() {
        PowSolution test = new PowSolution();
        double x = 4.7097;
        int n = 6;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionNegativePositive() {
        PowSolution test = new PowSolution();
        int x = -2;
        int n = 4;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }
    @Test
    public void powSolutionNegativeNegative() {
        PowSolution test = new PowSolution();
        int x = -2;
        int n = -4;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionOnePositive() {
        PowSolution test = new PowSolution();
        int x = 1;
        int n = -4;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionPositiveNegativeBigDouble() {
        PowSolution test = new PowSolution();
        int x = 1;
        int n = -2147483648;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionPositiveNegativeBigDouble2() {
        PowSolution test = new PowSolution();
        int x = 2;
        int n = -2147483648;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }


    @Test
    public void powSolutionPositivePositive2() {
        PowSolution test = new PowSolution();
        int x = 2;
        int n = 6;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionPositivePositive4() {
        PowSolution test = new PowSolution();
        int x = 2;
        int n = 14;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }

    @Test
    public void powSolutionPositiveNegative3() {
        PowSolution test = new PowSolution();
        double x = 8.95371;
        int n = -1;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }
    @Test
    public void powSolutionPositivePositive3() {
        PowSolution test = new PowSolution();
        double x = 42.14251;
        int n = 1;
        Assertions.assertEquals(Math.pow(x,n),test.myPow(x,n));
    }
}

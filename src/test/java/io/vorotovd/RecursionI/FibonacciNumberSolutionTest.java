package io.vorotovd.RecursionI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciNumberSolutionTest {
    @Test
    public void fibonacciNumberSolutionTestN10() {
        FibonacciNumberSolution solution = new FibonacciNumberSolution();
        Assertions.assertEquals(55,solution.fib(10));
    }
    @Test
    public void fibonacciNumberSolutionTestN4() {
        FibonacciNumberSolution solution = new FibonacciNumberSolution();
        Assertions.assertEquals(3,solution.fib(4));
    }
}

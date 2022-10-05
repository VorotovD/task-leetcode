package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPerfectSquareTest {

    @Test
    public void perfectSquareTrue1() {
        int num = 4;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertTrue(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareTrue2() {
        int num = 6084;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertTrue(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareTrue3() {
        int num = 65536;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertTrue(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareTrue4() {
        int num = 1537600;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertTrue(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareTrue5() {
        int num = 80407089;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertTrue(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareFalse1() {
        int num = 14;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertFalse(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareFalse2() {
        int num = 257;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertFalse(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareFalse3() {
        int num = 5513;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertFalse(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareFalse4() {
        int num = 1663223;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertFalse(solution.isPerfectSquare(num));
    }
    @Test
    public void perfectSquareFalse5() {
        int num = 168465447;
        ValidPerfectSquareSolution solution = new ValidPerfectSquareSolution();
        Assertions.assertFalse(solution.isPerfectSquare(num));
    }
}

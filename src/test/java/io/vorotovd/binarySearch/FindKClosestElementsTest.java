package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElementsTest {

    @Test
    public void findClosestOneElement1() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {1};
        int k = 1;
        int x = 0;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
    @Test
    public void findClosestOneElement2() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {1};
        int k = 1;
        int x = 1;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }

    @Test
    public void findClosestNotInArray1() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {1,1,1,10,10,10};
        int k = 1;
        int x = 9;
        List<Integer> expected = new ArrayList<>();
        expected.add(10);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
    @Test
    public void findClosestNotInArray2() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {1,2,2,2,3,3,3,5,5,6,7};
        int k = 6;
        int x = 4;
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(3);
        expected.add(3);
        expected.add(3);
        expected.add(5);
        expected.add(5);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
    @Test
    public void findClosestNormal1() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = { 1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
    @Test
    public void findClosestNormal2() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {0, 1, 2, 3, 4, 5, 6};
        int k = 4;
        int x = 3;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }

    @Test
    public void findClosestLeftBorder1() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {0, 1, 2, 3, 4, 5, 6};
        int k = 4;
        int x = 0;
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
    @Test
    public void findClosestLeftBorder2() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {0, 1, 2, 3, 4, 5, 6};
        int k = 4;
        int x = 1;
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }

    @Test
    public void findClosestRightBorder1() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {0, 1, 2, 3, 4, 5, 6};
        int k = 4;
        int x = 6;
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
    @Test
    public void findClosestRightBorder2() {
        FindKClosestElementsSolution solution = new FindKClosestElementsSolution();
        int[] test = {0, 1, 2, 3, 4, 5, 6};
        int k = 4;
        int x = 5;
        List<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        Assertions.assertEquals(expected,solution.findClosestElements(test,k,x));
    }
}

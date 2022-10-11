package io.vorotovd.RecursionI;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Test
    public void reverseString1() {
        ReverseStringSolution solution = new ReverseStringSolution();
        char[] actual = {5,4,3,2,1};
        char[] expected = {1,2,3,4,5};
        solution.reverseString(actual);
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void reverseString2() {
        ReverseStringSolution solution = new ReverseStringSolution();
        char[] actual = "Hello World!".toCharArray();
        char[] expected = "!dlroW olleH".toCharArray();
        solution.reverseString(actual);
        Assertions.assertArrayEquals(expected,actual);
    }

    @Test
    public void reverseString3() {
        ReverseStringSolution solution = new ReverseStringSolution();
        char[] actual = {};
        char[] expected = {};
        solution.reverseString(actual);
        Assertions.assertArrayEquals(expected,actual);
    }
}

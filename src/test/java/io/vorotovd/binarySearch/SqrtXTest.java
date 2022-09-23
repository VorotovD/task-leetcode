package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtXTest {
    @Test
    public void sqrtX63() {
        SolutionSqrtX test = new SolutionSqrtX();
        Assertions.assertEquals(7,test.mySqrt(63));
    }
    @Test
    public void sqrtX64() {
        SolutionSqrtX test = new SolutionSqrtX();
        Assertions.assertEquals(8,test.mySqrt(64));
    }
    @Test
    public void sqrtX65() {
        SolutionSqrtX test = new SolutionSqrtX();
        Assertions.assertEquals(8,test.mySqrt(65));
    }
    @Test
    public void sqrtX1() {
        SolutionSqrtX test = new SolutionSqrtX();
        Assertions.assertEquals(1,test.mySqrt(1));
    }
}

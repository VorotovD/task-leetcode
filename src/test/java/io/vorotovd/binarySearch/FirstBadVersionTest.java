package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstBadVersionTest {

    @Test
    public void firstBadVersionTest1() {
       SolutionFirstBadVersion test = new SolutionFirstBadVersion(1);
        Assertions.assertEquals(1,test.firstBadVersion(1));
    }
    @Test
    public void firstBadVersionTest10() {
        SolutionFirstBadVersion test = new SolutionFirstBadVersion(10);
        Assertions.assertEquals(10,test.firstBadVersion(20));
    }
}

package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class MinimumSizeSubarraySumTest {
    @Test
    public void minimumSize() {
        MinimumSizeSubarraySumSolution solution = new MinimumSizeSubarraySumSolution();
        int[] nums = {1,1,1,1,7};
        int target = 7;
        Assertions.assertEquals(1,solution.minSubArrayLen(target,nums));
    }
}

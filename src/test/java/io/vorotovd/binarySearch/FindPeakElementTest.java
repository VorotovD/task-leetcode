package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPeakElementTest {
    @Test
    public void findPeakElement4() {
        SolutionFindPeakElement peak = new SolutionFindPeakElement();
        int[] nums = {0,1,2,3,4,3,2,1,0};
        Assertions.assertEquals(4,peak.findPeakElement(nums));
    }

    @Test
    public void findPeakElement43() {
        SolutionFindPeakElement peak = new SolutionFindPeakElement();
        int[] nums = {0,1,2,3,4,3,2,1,0,1,2,3,1,0};
        int actual = peak.findPeakElement(nums);
        Assertions.assertTrue(actual == 4 || actual == 11);
    }

    @Test
    public void findPeakElementTwoPeaks() {
        SolutionFindPeakElement peak = new SolutionFindPeakElement();
        int[] nums = {6,5,4,3,4,5,4,3,2,1};
        int actual = peak.findPeakElement(nums);
        Assertions.assertTrue(actual == 6 || actual == 5);
    }
    @Test
    public void findPeakElementOneLeftPeak() {
        SolutionFindPeakElement peak = new SolutionFindPeakElement();
        int[] nums = {6,5,4,3,2,1};
        int actual = peak.findPeakElement(nums);
        Assertions.assertEquals(0,actual);
    }
}

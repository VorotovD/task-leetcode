package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void searchInRotatedArray1() {
        SolutionSearchInRotatedSortedArray test = new SolutionSearchInRotatedSortedArray();
        int[] nums = {5,6,7,8,1,2,3,4};
        int target = 1;
        Assertions.assertEquals(4,test.search(nums,target));
    }

    @Test
    public void searchInRotatedArray8() {
        SolutionSearchInRotatedSortedArray test = new SolutionSearchInRotatedSortedArray();
        int[] nums = {5,6,7,8,1,2,3,4};
        int target = 8;
        Assertions.assertEquals(3,test.search(nums,target));
    }

    @Test
    public void searchInRotatedArrayNotNums() {
        SolutionSearchInRotatedSortedArray test = new SolutionSearchInRotatedSortedArray();
        int[] nums = {5,6,7,8,1,2,3,4};
        int target = 9;
        Assertions.assertEquals(-1,test.search(nums,target));
    }
}

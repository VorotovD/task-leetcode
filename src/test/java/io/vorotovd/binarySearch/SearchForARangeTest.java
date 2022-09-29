package io.vorotovd.binarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SearchForARangeTest {


    @Test
    public void rangeNormal() {
        int[] searchArea = {1, 2, 3, 4, 5, 5, 5, 6, 7};
        int target = 5;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {4, 6};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }
    @Test
    public void rangeNotFound() {
        int[] searchArea = {2,2};
        int target = 1;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {-1,-1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeOneTargetInArea() {
        int[] searchArea = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {4, 4};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeByNullSearchArea() {
        int[] searchArea = {};
        int target = 0;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {-1, -1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeBorderRight() {
        int[] searchArea = {1, 2, 3, 4, 5, 5, 5};
        int target = 5;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {4, 6};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeBorderLeft() {
        int[] searchArea = {1, 1, 2, 3, 4, 5, 6, 7};
        int target = 1;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {0, 1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeNotFoundLeft() {
        int[] searchArea = {1, 1, 2, 3, 4, 5, 6, 7};
        int target = 0;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {-1, -1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeNotFoundRight() {
        int[] searchArea = {1, 1, 2, 3, 4, 5, 6, 7};
        int target = 8;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {-1, -1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }

    @Test
    public void rangeSmall1() {
        int[] searchArea = {1,2};
        int target = 1;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {0, 0};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }
    @Test
    public void rangeSmall2() {
        int[] searchArea = {1,2};
        int target = 2;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {1, 1};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }
    @Test
    public void rangeByOne() {
        int[] searchArea = {2};
        int target = 2;
        SearchForARangeSolution test = new SearchForARangeSolution();
        int[] expected = {0,0};
        Assertions.assertEquals(Arrays.toString(expected), Arrays.toString(test.searchRange(searchArea, target)));
    }
}

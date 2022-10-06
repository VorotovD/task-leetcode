package io.vorotovd.binarySearch;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        MinimumSizeSubarraySumSolution solution = new MinimumSizeSubarraySumSolution();
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(solution.minSubArrayLen(target, nums));
        nums = new int[]{1, 4, 4};
        target = 4;
        System.out.println(solution.minSubArrayLen(target, nums));
    }
}

class MinimumSizeSubarraySumSolution {

        public int minSubArrayLen(int target, int[] nums) {
            int resultSize = Integer.MAX_VALUE;
            int currSize;
            int currSum = nums[0];
            int l = 0;
            int r = 0;

            do {
                currSize = r - l + 1;
                if (currSum >= target && currSize < resultSize) {
                    resultSize = currSize;
                }
                if (currSum < target && r < nums.length - 1) {
                    r++;
                    currSum += nums[r];
                } else {
                    currSum -= nums[l];
                    l++;
                }
            } while (l < nums.length - 1 || r < nums.length - 1);

            currSize = r - l + 1;
            if (currSum >= target && currSize < resultSize) {
                resultSize = currSize;
            }

            if (resultSize == Integer.MAX_VALUE) {
                return 0;
            }

        return resultSize;
    }

//    private int getSum(int[] nums, int start, int end) {
//        int sum = 0;
//        for (int i = start; i <= end; i++) {
//            sum += nums[i];
//        }
//        return sum;
//    }
}
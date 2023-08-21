package com.cydeo.twoSum;

import java.util.Arrays;

public class TwoSumBruteForce {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int targetValue = 9;
        System.out.println(Arrays.toString(twoSumSolution(nums,targetValue)));

    }

    public static int[] twoSumSolution(int[] nums, int targetValue){
        for (int i = 0; i < nums.length; i++) {           // its runtime complexity is : O(n^2)
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i]+nums[j]==targetValue){
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{};
    }



}
/*
Requirements:

• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
• No solution will return empty array.
Example:
Input: nums = [2, 7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

1. For the Two Sum problem, turn the pseudo code into a brute-force solution.
2. Find the time complexity of your solution.
3. Are there any other cases we need to handle?

 */
/*
Java solution to LeetCode 167: Two Sum II - Input array is sorted.

Level: Easy

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Note:

Your returned answers (both index1 and index2) are not zero-based.
You may assume that each input would have exactly one solution and you may not use the same element twice.

Example:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

Submission:

Success

Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.

Memory Usage: 42.2 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
*/

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int target = 9;
        int[] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] < target)
                l++;
            else r--;
        }
        ans[0] = l + 1; ans[1] = r + 1;
        return ans;
    }
}
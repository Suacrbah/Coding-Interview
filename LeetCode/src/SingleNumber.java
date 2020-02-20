/*
Java solution to LeetCode 136: Single Number.

Level: Easy

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4

Submission:

Success

Runtime: 0 ms, faster than 100.00% of Java online submissions for Single Number.

Memory Usage: 42.2 MB, less than 5.19% of Java online submissions for Single Number.
*/

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        int ans = singleNumber(nums);
        System.out.printf("answer: %d\n", ans);
    }

    public static int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[0] ^= nums[i];
        return nums[0];
    }
}

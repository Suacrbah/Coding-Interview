/*
Java solution to LeetCode 169: Majority Element.

Level: Easy

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3

Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2

Submission:

Success

Runtime: 1 ms, faster than 99.85% of Java online submissions for Majority Element.

Memory Usage: 41.3 MB, less than 83.09% of Java online submissions for Majority Element.
*/

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {6, 5, 5};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int majority = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
                count++;
            } else if (majority == nums[i]) {
                count++;
            } else count--;
        }
        return majority;
    }
}
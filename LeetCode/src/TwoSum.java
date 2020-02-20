/*
Java solution to LeetCode 1: Two Sum.

Level: Easy

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

Submission:

Success

Runtime: 1 ms, faster than 99.92% of Java online submissions for Two Sum.

Memory Usage: 41.6 MB, less than 5.65% of Java online submissions for Two Sum.
*/

import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int ans[] = twoSum(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.printf("%d ", ans[i]);
        }
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }
        return ans;
    }
}
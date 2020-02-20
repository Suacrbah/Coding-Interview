/*
Java solution to LeetCode 136: Single Number.

Level: Easy

Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

Submission:

Success

Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.

Memory Usage: 37 MB, less than 6.02% of Java online submissions for Pascal's Triangle.
*/

import java.util.*;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Pascal = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> e = new ArrayList<Integer>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) e.add(1);
                else e.add(Pascal.get(i - 1).get(j - 1) + Pascal.get(i - 1).get(j));
            }
            Pascal.add(e);
        }
        return Pascal;
    }
}
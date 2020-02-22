/*
Java solution to LeetCode 119: Pascal's Triangle II.

Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 3
Output: [1,3,3,1]

Follow up:

Could you optimize your algorithm to use only O(k) extra space?

Submission:

Success

Runtime: 1 ms, faster than 84.82% of Java online submissions for Pascal's Triangle II.

Memory Usage: 37 MB, less than 6.17% of Java online submissions for Pascal's Triangle II.
*/
import java.util.ArrayList;

public class PascalsTriangleII {
    public static void main(String[] args) {
        System.out.println(getRow(5));
    }

    public static ArrayList<Integer> getRow(int rowIndex) {
        rowIndex++;
        ArrayList<Integer> temp, ans = new ArrayList<Integer>(rowIndex);
        for (int i = 0; i < rowIndex; i++) ans.add(0);
        for (int i = 0; i < rowIndex; i++) {
            temp = new ArrayList<Integer>(ans);
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == rowIndex - 1) ans.set(j, 1);
                else ans.set(j, temp.get(j - 1) + temp.get(j));
            }
        }

        return ans;
    }
}
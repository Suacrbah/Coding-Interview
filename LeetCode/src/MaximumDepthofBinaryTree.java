/*
Java solution to LeetCode 104: Maximum Depth of Binary Tree.

Level: Easy

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.

Submission:

Success

Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.

Memory Usage: 38.7 MB, less than 94.62% of Java online submissions for Maximum Depth of Binary Tree.
*/

public class MaximumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        int ans = maxDepth(root);
        System.out.printf("answer: %d\n", ans);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return l > r? l + 1 : r + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

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

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.printf("%d ", l3.val);
            l3 = l3.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp, iter = l1;

        while (true) {
            if (iter.val == l2.val) {

            }
            else if (iter.val < l2.val) {
                
            }
            break;
        }

        return l2;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

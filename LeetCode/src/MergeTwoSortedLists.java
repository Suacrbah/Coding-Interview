/*

Java solution to LeetCode 21: Merge Two Sorted Lists.

Level: Easy

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Example:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

Submission:

Success

Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Sorted Lists.

Memory Usage: 38.2 MB, less than 19.53% of Java online submissions for Merge Two Sorted Lists.
*/

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);

        ListNode l3 = mergeTwoLists(l1, l2);
        while (l3 != null) {
            System.out.printf("%d ", l3.val);
            l3 = l3.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp, iter;

        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            iter = l1;
        } else {
            iter = l2;
            l2 = l1;
            l1 = iter;
        }

        while (true) {
            if (l2 == null || iter == null) {
                return l1;
            } else if (iter.next == null) {
                iter.next = l2;
                return l1;
            }
            if (iter.val <= l2.val) {
                while (iter.next != null && iter.next.val <= l2.val) 
                    iter = iter.next;
                temp = iter.next;
                iter.next = new ListNode(l2.val);
                iter.next.next = temp;
                iter = iter.next;
                l2 = l2.next;
            }
        }
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/*
Java solution to LeetCode 2: Add Two Numbers.

Level: Medium

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.

Submission:

Success

Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Two Numbers.

Memory Usage: 40.9 MB, less than 92.79% of Java online submissions for Add Two Numbers.
*/

class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);

        ListNode l2 = new ListNode(1);

        ListNode res = addTwoNumbers(l1, l2);
        while (res != null) {
            System.out.printf("%d ", res.val);
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode iter = l1;
        int temp, carry = 0;

        while (true) {
            temp = iter.val + l2.val + carry;
            if (temp >= 10) carry = 1;
            else carry = 0;
            iter.val = temp % 10;
            // End of l1
            if ((iter.next == null) && (l2.next != null)) {
                iter.next = l2.next;
                while (carry == 1) {
                    iter.next.val += carry;
                    if (iter.next.val >= 10) carry = 1;
                    else carry = 0;
                    iter.next.val %= 10;
                    if (carry == 1 && iter.next.next == null) {
                        iter.next.next = new ListNode(1);
                        break;
                    }
                    iter = iter.next;
                }
                break;
            }
            // End of l2
            else if ((iter.next != null) && (l2.next == null)) {
                while (carry == 1) {
                    iter.next.val += carry;
                    if (iter.next.val >= 10) carry = 1;
                    else carry = 0;
                    iter.next.val %= 10;
                    if (carry == 1 && iter.next.next == null) {
                        iter.next.next = new ListNode(1);
                        break;
                    }
                    iter = iter.next;
                }
                break;
            }
            // End of both list
            else if (iter.next == null && l2.next == null) {
                if (carry == 1)
                    iter.next = new ListNode(1);
                break;
            }
            iter = iter.next;
            l2 = l2.next;
        }

        return l1;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

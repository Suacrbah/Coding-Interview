public class CountbackKnodes {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode iter = head;
        for (int i = 2; i < 11; i++) {
            iter.next = new ListNode(i);
            iter = iter.next;
        }
        System.out.println(FindKthToTail(head, 3));
    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) return null;
        ListNode r = head;
        for (int i = 0; i < k - 1; i++) {
            r = r.next;
            if (r == null) return null;
        }
        while (r.next != null) {
            head = head.next;
            r = r.next;
        }
        return head;
    }
}
